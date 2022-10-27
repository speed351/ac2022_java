package test.main;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int point = 1000;
		Scanner scan = new Scanner(System.in);
		while(true) {
			if(point==0) {
				break;
			}
			System.out.println("Enter를 치세요");
			scan.nextLine();
			
			
			System.err.println("수행 중... (잔여 point : "+point+")");
			point -=10;
			
		}
	}
}
