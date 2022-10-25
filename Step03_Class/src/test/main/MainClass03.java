package test.main;

import test.mypac.Member;

/*
 * 1. 한명의 회원 정보를 담을 수 있는 객체를 생성할 member 클래스를 test.mypac 패키지에 만들어보세요
 * 
 * 회원 한명의 정보는 번호, 이름, 주소로 이루어져 있다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 2. member 클래스로 객체를 생성해서 참조값을 m1이라는 지역변수에 담아보세요
		 * 
		 * 3. m1에 담긴 참조값을 이용해서 1, 김구라, 노량진 이라는 정보를 객체에 저장해보세요.
		 * 
		 */
		Member m1= new Member();
		m1.num=1;
		m1.name="김구라";
		m1.addr="노량진";
		
		//System.out.println("번호:"+m1.num+", 이름:"+m1.name+", 주소:"+m1.addr);
		m1.showInfo();
		
		
		Member m2=new Member();
		m2.num=2;
		m2.name="해골";
		m2.addr="행신동";
	
		//System.out.println("번호:"+m2.num+", 이름:"+m2.name+", 주소:"+m2.addr);
		m2.showInfo();
		
		
	}
}
