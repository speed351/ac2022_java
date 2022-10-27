package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1 = new HandPhone();
		
		//SmartPhone이 가지고 싶어 하는 자식
		
		// type casting 시도
		SmartPhone p2 = (SmartPhone)p1;	//ClassCastException 발생
		p2.doInternet();				//종자가 SmartPhone이 아니라 불가능
		
	}
}
