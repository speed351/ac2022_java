package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	//내부 클래스
	//내부 클래스에 static 선언하여 해결
	static class YourWeapon extends Weapon{
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("눈을 공격해");
		}
	}
	
	public static void main(String[] args) {
		Weapon w1 = new YourWeapon();
		useWeapon(w1);
		
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("발을 공격해");
			}
		}
		Weapon w2 = new OurWeapon();
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
