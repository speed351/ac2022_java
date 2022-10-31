package test.main;

import java.util.ArrayList;

/*
 * java에서 배열은 크기를 조절할 수 없는 고정배열이다.
 * 
 * 따라서 동적으로 item을 추가하고 삭제하는 작업을 하려면 일반배열은 사용할 수 없다.
 * 
 * 그래서 해당 작업을 하려면 ArrayList 객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// String type을 저장할 수 있는 ArrayList 객체 생성
		ArrayList<String> names = new ArrayList<>();
		
		//3개의 String type을 저장하기
		names.add(0, "kim");
		names.add(1, "lee");
		names.add(2, "choi");
		System.out.println(names.get(0)+", "+names.get(1)+", "+names.get(2));
		//0번방의 아이템을 불러와서 item이라는 변수에 담아보세요
		String item = names.get(0);
		System.out.println(item);
		//1번방의 아이템을 삭제
		names.remove(1);
		System.out.println(names.get(0)+", "+names.get(1));
		//0번방에 "에이콘"넣기
		names.add(0,"acorn");
		System.out.println(names.get(0)+", "+names.get(1)+", "+names.get(2));
		//저장된 아이템의 갯수를 size라는 지역변수에 담기
		int size =names.size();
		//저장된 아이템 전체 삭제
		names.clear();
		
	}
}
