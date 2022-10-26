package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * [기본 data type의 참조 data type]
		 * 
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * 
		 * float : Float
		 * double : Double
		 * 
		 * char : Character
		 * boolean : Boolean
		 * 
		 * - 때로는 기본 data type의 참조 data type이 필요할 때가 있다.
		 * - 기본 data type을 객체에 포장(boxing)하는 형태이다
		 * - boxing과 unboxing은 자동으로 되기 때문에 프로그래머가 신경을 쓸 필요는 없다.
		 * 
		 * 
		 */
		
		int num1 = 10;			//기본 data type
		Integer num2 = 10;		//Integer class에 정의된 기능을 .을 찍어 사용가능하다
		
		//참조 data type이지만 기본 data type처럼 사용할 수 있다.
		int result1 = num2 + 1;
		int result2 = num1 + num2;
		Integer result3 = num1 + num2;

		//문자를 숫자로 바꾸기(String type -> int type)
		System.out.println(Integer.parseInt("999999")); // Integer 클래스의 static 메소드 호출에도 사용 가능
		
	}
}
