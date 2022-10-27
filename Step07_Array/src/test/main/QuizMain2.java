package test.main;

import java.util.Random;

public class QuizMain2 {
   
   public static void main(String[] args) {
      /*   
        *   2. run 했을때
             5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
       *      예)  cherry | apple | cherry
       *           7 | apple | melon
       *           7 | 7 | 7
       */
      String[] items={"cherry", "apple", "banana", "melon", "7"};
      //랜덤한 숫자를 얻어내기 위한 객체 
      Random ran=new Random();
      
      //for 문 안에서 얻어낸 랜덤한 숫자 3개를 저장할 배열 객체 생성
      int[] nums = new int[3];
      
      for(int i=0; i<3; i++) {
         // 0~4 사이의 랜덤한 숫자를 하나 얻어내서 
         int ranNum=ran.nextInt(5);
         // 배열의 인덱스로 활용해서 문자열 출력하기
         System.out.print(items[ranNum]);
         if(i < 2) {
            System.out.print(" | ");
         }
         //배열에 얻어낸 랜덤한 숫자를 저장하기
         nums[i]=ranNum;
      }
      System.out.println();
      boolean isEqual = nums[0] == nums[1] && nums[1] == nums[2];
      if(isEqual) {
    	  System.out.println("10점 입니다.");
      }
   }
}










