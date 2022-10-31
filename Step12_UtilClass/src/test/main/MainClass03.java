package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 ArrayList 객체를 생성해서 참조값을 List 인터페이스 type의 지역변수 nums에 담기
		//기본 data type를 generic class에 활용하고 싶다면, 기본 data type의 Object에 담아서 사용한다. 
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		for(int tmp:nums) {
			System.out.println(tmp);
		}
		System.out.println("------");
		nums.forEach((item)->{
			System.out.println(item);
		});
		
	}
}
