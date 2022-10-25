package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		byte iByte =10;
		short iShort=10;
		int iInt=10000;
		long ilong=10;
		
		int tmp = iShort;
		byte tmp2 = (byte)iShort; // casting 형변환
		
		
		float num1 = 10.1f;
		double num2 = 10.2d;
		double num3 = 10.3; // d, f를 붙이지 않으면 double type으로 간주된다.
		
		//float type에 있는 값을 double type에 담기
		double tmp3 = num1;
		
		float tmp4 = (float)num2;	// casting 필요
		
		
		
		System.out.println("메소드를 종료합니다");
	}

}
