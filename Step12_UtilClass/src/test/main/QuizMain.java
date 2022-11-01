package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		// sample data
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 * 검색할 단어 를 입력하세요 : house
		 * house의 뜻은 집입니다.
		 * 
		 * 검색할 단어를 입력하세요 : gura
		 * gura는 목록에 없습니다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		//입력받은 단어를 Map의 key값으로 활용해서 value 값을 읽어 와본다.
		//해당 key 값으로 저장된 value가 없을수도 있다.
		String result1 = dic.get(word);
		if(result1 != null) {		//찾는 단어가 있으면
			System.out.println(word+"의 뜻은 "+result1+"입니다.");
		}else						//찾는 단어가 없으면
			System.out.println(word+"는 목록에 없습니다.");
		
		
			
	}
}
