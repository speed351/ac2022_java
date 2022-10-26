package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 0~10사이의 랜덤한 정수를 얻어내서 콘솔창에 출력하고 싶다.
		 */
		
		Random rand = new Random();
		int randNum = rand.nextInt(10);
		
		System.out.println(randNum);
		
		
		System.out.println((int)(Math.random()*10));
		
		// 1~45 사이의 정수 하나를 얻어내서 randNum2라는 지역변수에 담기
		// true or false 값을 받아내서 isRun이라는 지역변수에 담기
		
		int randNum2 = rand.nextInt(1,46);
		boolean isRun = rand.nextBoolean();
		
		System.out.println(randNum2);
		System.out.println(isRun);
	}
}
