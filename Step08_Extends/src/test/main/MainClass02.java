package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 
 * java의 
 * 다형성은 type이 여러개라는 의미.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//다형성, 부모타입을 사용하며 프로그램이 유연해진다
		HandPhone p1 = new HandPhone();
		//어떤 객체의 참조값을 부모 type으로 받을 수 있다.
		Phone p2 = new HandPhone();
		
		Object p3 = new HandPhone();
		
		p2.call();
		
	}
}
