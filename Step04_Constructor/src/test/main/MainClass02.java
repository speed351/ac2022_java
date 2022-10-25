package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 콘솔창에 "안녕하세요"를 출력하려고 한다
		 * 
		 * 해당 목표를 달성하려면 콘솔창에 출력을 할 수 있는 기능을 가진 객체가 필요하다.
		 * 
		 * 그 객체는 어디있는가? System 클래스의 out 이라는 static 필드에 
		 * 
		 * 해당 객체의 참조값이 들어있다.
		 * 
		 * 그 객체는 무슨 type인가 ? PrintStream type이다
		 * 
		 * 그 객체를 누가 생성했나? java에서 이미 생성해서 미리 준비된 객체이다.
		 * 
		 * system 클래스는 왜 import 안해도 사용할 수 있는가?
		 * 
		 * System, String 등의 클래스는 java.lang 패키지에 있는 클래스이며, 해당 패키지에 있는 모든 클래스는
		 * 
		 * 마치 기본 클래스처럼 import없이 사용할 수 있다.
		 *  
		 */
		
		//overloading 된 println() 메소드 사용해보기
		System.out.println("안녕하세요");
		System.out.println(999);
		System.out.println(true);
		System.out.println('a');
		
		MyObject mo = new MyObject();
		mo.send();
		mo.send(1);
		mo.send("john");
		mo.send(new Car().name="람보르기니");
	}
}
