package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 * - class 예약어 앞에 abstract를 명시해서 클래스를 정의한다.
 * - 형태만 정의되고 실제 구현은 되지않은 메소드가 존재할 수 있다.
 * - 형태만 정의된 메소드를 만들때는 abstract 예약어를 붙여서 메소드를 정의한다.
 * - 생성자는 존재하지만 단독으로 객체생성은 불가하다.
 * - 추상 클래스 type의 id가 필요하다면 추상클래스를 상속받은 자식클래스르 정의해서 객체 생성한다.
 * - 추상클래스를 상송받은 자시클래스는 부모의 추상메소드를 모두 오버라이드 해야한다
 */
public class MainClass01 {
	public static void main(String[] args) {
		//추상클래스도 data type의 역할을 할 수가 있다.
		
		Weapon w1 = null;
		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
