package test.main;

import test.mypac.Member;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Member 객체를 생성해서
		 * 2. 회원 한명의 정보를 담고
		 * 3. shwoInfo() 메소드를 호출해보세요.
		 */
		
		Member m3 = new Member();
		
		m3.num=5;
		m3.name="park";
		m3.addr="seoul";
		
		m3.showInfo();
	}
}
