package test.main;

import java.lang.reflect.Array;

public class MainClass01 {
	public static void main(String[] args) {
		//int type 5개를 저장하고 있는 배열 객체를 생성해서 참조값을 nums라는 지역변수에 담기
		
				
		int[] nums = {10,20,30,40,50};
		double[] nums2 = {10.2,10.2,10.3,10.4,10.5};
		boolean[] truth = {true, true, false, true, true};
		String[] names = {"kim", "lee","pakr","choi","kwon"};
		
		//배열 각각의 방 참조하기
		int result1 = nums[0];
		double result2 = nums2[1];
		boolean result3 = truth[2];
		String result4 = names[3];
		
		//배열 객체의 메소드와 필드 사용해보기
		int[] cloned = nums.clone();	//복제(다른 메모리)
		int[] copyed = nums;			//참조값 복사(같은 메모리)
		int size = nums.length;
	}
}
