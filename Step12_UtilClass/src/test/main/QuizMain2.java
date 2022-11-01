package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain2 {
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
		while(true) {
			System.out.print("검색할 단어를 입력하세요 : ");
			String word = scan.next();
			/*
			 * java에서는 문자열 객체를 만드는 방법에 따라서 내용이 같으면 참조값이 같을수도 있고 내용은 같지만 참조값이 다를수도 있다.
			 * 따라서 ==, != 연산자로 문자열의 내용이 같은지 비교하면 안된다.
			 * 우리는 문자열의 참조값이 같은지 비교할 일이 많을까 아니면 문자열의 내용이 같은지 비교할 일이 많을까
			 * 당연히 내용이 같은지 비교할 일이 많다.
			 * 그렇다면 어떻게 비교할까?
			 * >> String 객체의 .equals() 메소드를 활용한다.
			 */
			if(word.equals("q")){
				break;
			}
			//입력받은 단어를 Map의 key값으로 활용해서 value 값을 읽어 와본다.
			//해당 key 값으로 저장된 value가 없을수도 있다.
			
			//해당 키값이 존재하는지 여부 확인
			boolean isExist = dic.containsKey(word);
			
			String result1 = dic.get(word);
			if(isExist) {		//찾는 단어가 있으면
				System.out.println(word+"의 뜻은 "+result1+"입니다.");
			}
			else						//찾는 단어가 없으면
				System.out.println(word+"는 목록에 없습니다.");				
		}
		
			
	}
}
