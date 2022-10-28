package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.Remocon2;
import test.mypac.SubRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		r1.down();
		r1.up();
		
		// 직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon()메소드를 여기서 호출
		SubRemocon sr = new SubRemocon();
		useSubRemocon(sr);
		
		
	}

	public static void useSubRemocon(Remocon2 r) {
		r.powerOn();
		r.powerOff();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
