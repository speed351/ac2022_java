package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class TestMain {
	public static void main(String[] args) {
		//Weapon type의 참조값을 담을수있는 w라는 이름의 지역변수 선언
		Weapon w = new MyWeapon();
		w.attack();
		w.prepare();
	}
}
