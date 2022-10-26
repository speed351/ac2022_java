package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main method start");
		// 키보드로부터 입력 받을 수 있는 기능을 가진 객체 생성
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 : ");
		//한줄 입력 받고
		String str = scanner1.nextLine();
		//입력받은 문자열을 출력
		System.out.println("입력한 문자열은 : "+str+" 입니다.");
		
		
		
		
		
		
		
		
		System.out.println("main method end");
	}
}
