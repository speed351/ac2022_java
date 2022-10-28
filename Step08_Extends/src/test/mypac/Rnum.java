package test.mypac;

import java.util.Random;

public class Rnum {
	//재귀로 랜덤숫자를 뽑아보자
	Random rand = new Random();
	int[] target_num = new int[3];
	int n=0;
	public void pop_num() {
		if(n==0) {
			target_num[n] = rand.nextInt(1,10);
			n++;
			pop_num();
		}else if(n==1) {
			target_num[n] = rand.nextInt(1,10);
			if(target_num[n]==target_num[n-1]) {
				pop_num();
			}
			n++;
			pop_num();
		}else if(n==2) {
			target_num[n] = rand.nextInt(1,10);
			if(target_num[n]==target_num[n-1]) {
				pop_num();
			}else if(target_num[n]==target_num[n-2]) {
				pop_num();
			}else
				System.out.println("선택된 숫자 : "+target_num[0]+""+target_num[1]+""+target_num[2]);

		}
		
	}
}	
		
//		//중복없는 무작위 세자리 숫자 뽑기
//		for(int i = 0; i < target_num.length ; i++) {
//			target_num[i]  = rand.nextInt(8)+1;
//			for(int j = 0; j < i; j++) {
//				if(target_num[i] == target_num[j]) {
//					i--;
//				}
//			}			
//		}
	
	
	
	

