package test.mypac;
/*
 * [생성자]
 * 
 * 1. 클래스 명과 동일하다
 * 2. 메소드 모양과 유사하지만 리턴 type이 없다.
 * 3. 객체를 생성할때(new 할 때) 호출된다.
 * 4. 객체를 생성하는 시점에 무언가 준비 작업을 할 때 유용하다.
 * 5. 생성자를 명시적으로 정의하지 않아도 기본 생성자는 있다고 간주된다.
 * 
 */
public class Student {
	public Student(){
		System.out.println("생성자 호출");
	}
	public void study() {
		System.out.println("공부해요");
	}
	
}
