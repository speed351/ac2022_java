package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나눌 수 입력 : ");
		String inputNum1 = scan.nextLine();
		System.out.print("나누어 지는 수 입력 : ");
		String inputNum2 = scan.nextLine();
		
		try {
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			
			int result=num2/num1;
			int result2=num2%num1;
			System.out.println(num2+"를 "+num1+" 으로 나눈 몫 : "+result);
			System.out.println(num2+"를 "+num1+" 으로 나눈 나머지 : "+result2);
				
		}catch(NumberFormatException nfe) {
			System.out.println("숫자를 입력해주세요");
		}catch(ArithmeticException ae) {
			System.out.println("수학 논리에 맞지 않음");
		}catch(Exception e) {						//nfe, ae 뿐만 아니라 모든 Exception을 처리한다 
			System.out.println("뭔가 에러가 발생했음");
		}finally {//위의 상황과 상관없이 반드시 실행이 보장되어야 하는 블럭
			System.out.println("아 이건 못참지");
		}
		
		System.out.println("main 메소드가 정상 종료됩니다.");
	}
}
