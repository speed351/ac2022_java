package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//[0]으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역변수 nums에 담기
		
		int[] room1 = {0, 0, 0};
		
		room1[0] = 10;
		room1[1] = 20;
		room1[2] = 30;
		
		
		
		for(int i=0;i<3;i++) {
			System.out.println(room1[i]);
		}
		
		
		//0으로 초기화 된 방 100개짜리 int[]객체를 만들어서 참조값을 지역변수 nums2에 담기
		int [] room2 = new int[3];
		room2[0]=100;
		room2[1]=200;
		room2[2]=300;
		//room2[3]=400;
		
		
		System.out.println("main 메소드 정상 종료됩니다.");
	}
}
