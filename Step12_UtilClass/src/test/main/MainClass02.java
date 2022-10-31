package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass02 {
	public static void main(String[] args) {
		//ArrayList 객체를 생성해서 List 인터페이스 type 지역변수에 넣기
		List<String> names = new ArrayList<>();
		names.add("kim");
		names.add("lee");
		names.add("park");
		names.add("choi");
		names.add("seo");
		
		//반복문 돌면서 친구 이름을 순서대로 콘솔창에 출력해보기
		System.out.println("--일반 for문--");
		for(int i = 0 ; i<names.size(); i++) {
			String tmp=names.get(i);
			System.out.println(names.get(i));
		}
		System.out.println("--확장 for문--");
		for(String tmp:names) {
			System.out.println(tmp);
		}
		
		System.out.println("--forEach() 활용 1--");
		Consumer<String> con = new Consumer<>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);				
			}
		};
		names.forEach(con);
		
		
		System.out.println("--forEach() 활용2--");
		Consumer<String> con2=(t)->{
			System.out.println(t);
		};
		
		System.out.println("--forEach() 활용3--");
		names.forEach((t)->{});
		
		System.out.println("--ex--");
		Consumer<String> name1= (name)->System.out.println(name);
		names.forEach(name1);
	}
}
