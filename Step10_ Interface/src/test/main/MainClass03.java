package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	//필드에 Remocon 참조 넣기
	// 선언한게 class면 extends, interface면 implements
	// static 메소드 안에서 사용해야 되기 때문에 static 필드로 만들어준다
	// anonymous inner class를 이용해서 interface type의 참조값을 얻어내기
	
	static Remocon r1 = new Remocon() {
		@Override
		public void up() {
			// TODO Auto-generated method stub
			System.out.println("이것도 올려보시지");
		}
		
		@Override
		public void down() {
			// TODO Auto-generated method stub
			System.out.println("이것도 내려보시지");
		}
	};
	
	
	
	public static void main(String[] args) {
		useRemocon(r1);
		
		//anonymous local inner class를 이용해서 interface type의 참조값을 얻어내기
		Remocon r2 = new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("그만 올려");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("그만 내려");
			}
		};
		useRemocon(r2);
		
		
		//메소드 호출하면서 Remocon type을 즉석에서 얻어내서 전달하기
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("그만 올려... 죽여줘");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("그만 내려... 죽여줘");
			}
		});
	}
	
	
	//
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
