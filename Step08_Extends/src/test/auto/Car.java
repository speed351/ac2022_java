package test.auto;
/*
 * 접근지정자 접근범위
 * 
 * public : 어디서나 접근가능
 * protected : 동일한 package 혹은 상속환계에서 자식에서 접근가능
 * default : 동일한 package 안에서만 접근 가능
 * private : 동일한 클래스 혹은 동일한 객체 안에서만 접근 가능
 * 
 *  - 접근지정자를 붙이는 위치
 *  1. 클래스 선언 시
 *  2. 생성자
 *  3. 필드
 *  4. 메소드
 *  
 *  클래스는 default와 public 두가지의 접근지정자만 지정 가능하다.
 *  접근 지정자를 생략한 것이 default 접근 지정자다.
 */
public class Car {
	//필드
	protected Engine engine;
	
	//Engine 객체를 인자로 전달받는 생성자
	public Car(Engine engine) {
		//생성자로 전달받은 Engine 객체의 참조값을 필드에 저장
		this.engine = engine;
	}
	
	//메소드
	public void drive(){
		if(this.engine==null) {
			System.out.println("엔진이 없어 달릴 수 없습니다.");
		}
		System.out.println("달린다");
	}
	
}
