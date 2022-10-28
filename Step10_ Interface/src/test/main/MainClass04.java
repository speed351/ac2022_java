package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		//1. interface의 override 메소드가 1개인경우 1.을 2.와 같이 쓸수있다.
		useDrill(new Drill() {
			@Override
			public void hole() {
				// TODO Auto-generated method stub
				System.out.println("그냥 드릴");
			}
		});
		
		
		//2.
		useDrill(()->{
			System.out.println("압축 드릴");
		});
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
}
