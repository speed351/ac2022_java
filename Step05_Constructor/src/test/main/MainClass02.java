package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		//기본 생성자를 호출하면서 객체 생성
		Member m1 = new Member();
		m1.num=2;
		m1.name="lee";
		m1.addr="busan";
		
		//매개변수를 전달하는 생성자를 호출하면서 객체 생성
		Member m2 = new Member(1, "kim", "seoul");
		
		m1.showInfo();
		m2.showInfo();
		
	}
}
