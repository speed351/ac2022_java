package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		//추상 메소드 호출 시 Joinner j1 = new Joinner 입력 후 ctrl + space해서 자동완성
		//1. 1번 타입
		Joinner j1 = new Joinner() {
			
			@Override
			public String join(String one, String two) {
				// TODO Auto-generated method stub
				return one + two;
			}
		};
		String result1=j1.join("안녕", "하세요");
		
		//2. String 같은 type 생략 가능
		Joinner j2 = (one,two)->{ //(String one, String two)
			return one+two;
		};
		
		//3. 메소드 내부에 특별히 실행할 코드가 없다면 더 간단하게 아래와 같이 리턴값만 명시하면 된다.
		//람다식 표현
		Joinner j3 = (one,two)->one+two;
		
		
	}
	
}
