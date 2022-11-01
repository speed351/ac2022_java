package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		try {
			/*
			 * 실햄의 흐름을 스레드라고 하는데, 스레드를 임의로 5초동안 잡아두기
			 * 컴파일시에 발생하는 Exception이 발생하기 땜누에 반드시 try~catch 블럭으로 예외처리를 해야한다
			 */
			Thread.sleep(5000);					//java.lang 클래스에 있는 클래스
		} catch (InterruptedException e) {		//Unhandled exception은 반드시 처리해야 하는 exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
