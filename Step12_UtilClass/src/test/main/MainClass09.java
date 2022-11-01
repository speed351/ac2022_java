package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass09 {
	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("kim");
		names.add("lee");
		names.add("park");
		names.add("choi");
		names.add("na");
		//Iterator 객체를 사용해서 HashSet에 있는 값을 받아온다
		//저장된 item을 일렬로 세웠다고 생각하면 됨
		Iterator<String> it = names.iterator();
		//cursor 다음에 item이 있는 동안에만 반복문을 돌면서
		while(it.hasNext()) {
			//cursor를 다음칸으로 이동해서 커서가 위치한 곳의 item 읽어오기
			String item=it.next();
			System.out.println(item);
		}
		//특정 item(data, 참조값) 존재 여부 알아내기
		boolean isContain = names.contains("kim");
		//저장된 item 개수
		int size = names.size();
		//특정 item 삭제
		names.remove("na");
		//모든 item 삭제
		names.clear();
		
			
		
	}
}
