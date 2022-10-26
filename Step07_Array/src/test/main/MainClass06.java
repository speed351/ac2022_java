package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		
		// 1. 문자열을 저장할 수 있는 방 5개짜리 배열개겣를 생성해서 msg라는 지역변수에 담자
		String[] msgs = new String[5];
		// 2. 키보드로부터 입력 받을 수 있는 Scanner 객체를 생성해서 참조값을 scan이라는 지역변수에 담는다.
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<msgs.length;i++) {
			System.out.print("문자열을 입력해주세요 : ");
		
		// 3. 반복문을 통해 입력받기
		String str = scan.nextLine();
		msgs[i]=str;
		}
		// 4. 입력 받은 내용 출력하기
		for(int i=0; i<msgs.length;i++) {
			System.out.println("입력받은 문자열 : "+msgs[i]);
		}
		
		
	}
}
