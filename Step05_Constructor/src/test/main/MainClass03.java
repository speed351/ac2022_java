package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 1. MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담기
		 * 단 MacBook 클래스 수정 X
		 * 
		 * 
		 * 2. ma1 지역변수에 들어있는 참조값을 사용해서 .doGame()라는 메소드를 호출하기
		 */
		
		Cpu c1 = new Cpu();
		Memory m1 = new Memory();
		HardDisk h1 = new HardDisk();
		
		MacBook mac1 = new MacBook(c1, m1, h1);
		mac1.doGame();
		
		
		MacBook mac2 = new MacBook(new Cpu(), new Memory(), new HardDisk());
		mac2.doGame();
		
		
	}
}
