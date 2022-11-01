package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어할 수 있는 객체를 생성
		 * 해당 객체의 참조값을 지역변수 f에 저장
		 */
		File f = new File("C:\\acorn202210/myFolder/memo.txt");
		
		//실제 memo.txt 파일이 존재하지 않으면 파일을 만들고, 존재한다면 memo.txt 파일을 삭제하기
		
		if(f.exists()) {
			f.delete();
		}
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error 발생");
		}
	}
}
