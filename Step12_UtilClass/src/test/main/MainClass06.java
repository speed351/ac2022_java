package test.main;
/*
 * java에서 어떤 데이터를 key:value형태로 관리하고 싶으면 Hashmap 객체를 사용한다
 * 
 * - java에서 어떤 data를 key:value의 쌍으로 관리하고 싶으면 HashMap 객체를 사용한다.
 * - key의 generic도 마음대로 지정할 수 있지만 보통 String type으로 한다.
 * - value 의 generic은 그때 그때 다르지만 value가 여러가지 type이면 object type으로 지정한다.
 */
import java.util.HashMap;

public class MainClass06 {
	public static void main(String[] args) {
		//HashMap<Key, Value> map1 = new HashMap<>(); 보통 이런 형식
		HashMap<String, Object> map1 = new HashMap<>();
		
		/*
		 * value의 generic 클래스가 object로 지정되어 있기 때문에
		 * 리턴되는 Object type을 원래 type으로 casting 해야한다
		 * 
		 */
		int num = (int)map1.get("num");
		String name = (String)map1.get("name");
		boolean isMan=(boolean)map1.get("isMan");
		
		//동일한 key값으로 다시 담으면 수정
		map1.put("name", "acorn");
		
		//특정 key값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false 리턴
		map1.remove("isMan");
		
		//모두삭제
		map1.clear();
		
	}
}
