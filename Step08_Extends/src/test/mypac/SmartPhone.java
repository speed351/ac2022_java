package test.mypac;

public class SmartPhone extends HandPhone {
	public SmartPhone() {
		System.out.println("SmartPhone 생성자 호출");
	}
	
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		//super.takePicture();   // 부모 메소드도 호출하는 기본 형식, 필요없으면 지워도 됨
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}
