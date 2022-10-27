package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 그 참조값을 Object type p3 지역변수에 담기
		Object p3 = new HandPhone();
		//Object type 변수에 담긴 값을 Phone type 변수에 담기
		//Phone p2 = p3;  >> 에러가 발생한다
		//casting 해서 해결할 수 있다.
		Phone p2 = (Phone)p3;
		//Object type 변수에 담긴 값을 HandPhone type 변수에 담기
		//HandPhone p1 = p3; >> 에러 발생
		HandPhone p1 = (HandPhone)p3;
		
	}
}
