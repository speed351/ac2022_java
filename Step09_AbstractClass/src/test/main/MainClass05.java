package test.main;

import java.util.Scanner;

import test.mypac.Weapon;

public class MainClass05 {
	//필드
	int num = 999;
	String name = "kim";
	Scanner scan1 = new Scanner(System.in);
	//필드는 선언만 하면 기본값이 들어간다
	int weight;		//0
	String msg;		//null
	Scanner scan2;  //null
	//static 영역에 올리고 싶은 필드는 static 예약어를 통해서 만든다.
	static String greet="hello";
	
	// 추상메소드를 필드에 선언할때는 override해서 열어줘야한다.(익명 inner 클래스)
	// class ??? extends Weapon(){
	//
  	// }
	// Anonymous Inner Class를 이용해서 Weapon type의 참조값 얻어내기(Local이 아님)
	static Weapon w1 = new Weapon() {
		
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("이게되네");
		}
	};
	
	//main
	public static void main(String[] args) {
		//메소드 호출하면서 static 필드에 미리 준비된 값을 전달하기
		useWeapon(w1);
		
		
		// Anonymous Local Inner Class를 이용해서 Weapon type의 참조값 얻어내기
		Weapon w2 = new Weapon() {
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("공격만하네");
			}
		};
		//메소드 호출하면서 지역변수에 미리 준비된 값을 전달하기
		useWeapon(w2);
		
		
		//메소드 호출하면서 값을 즉석에서 만들어서 전달하기
		useWeapon(new Weapon(){
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("싱기방기");
			}
		});
		
	}
	
	
	//메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
