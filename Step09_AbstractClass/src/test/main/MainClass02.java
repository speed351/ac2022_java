package test.main;

import test.mypac.CustomWeapon;
import test.mypac.Gun;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		test("ㅎㅇ");
		
		// 직접 클래스를 만들고 객체 생성을해서 아래의 useWeapon() 메소드를 호출
		Weapon custom = new CustomWeapon(); 
		useWeapon(custom);
		Weapon g1 = new Gun();
		useWeapon(g1);
		
	}
	
	public static void test(String msg) {
		System.out.println(msg);
	}
	
	//인자로 전달된 Weapon type을 받아서 사용하는 static 추상클래스 
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		
	}
}
