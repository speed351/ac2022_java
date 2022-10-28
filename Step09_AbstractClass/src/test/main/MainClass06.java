package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	static Weapon w1 = new Weapon() {

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("쏴라~!");
		}
		
	};
	
	public static void main(String[] args) {
		Weapon w2 = new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("징동 따운!!");
			}
		};
		useWeapon(w1);
		useWeapon(w2);
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("젠지 DRX 나와!");
			}
		});
	}
	
	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
