package test.mypac;

public class Member {
	//값들을 저장할 필드
	public int num;
	public String name;
	public String addr;
	
	//생성자
	public Member(int num, String name, String addr) {//생성자도 매개변수 선언 가능
		// 필드의 변수를 사용 가능
		this.num = num;
		this.name = name;
		this.addr = addr;	
	}
	// 위의 생성자는 매개변수를 안넣으면 에러가 발생하므로
	// 기본 생성자가 필요한 경우라면 명시적으로 정의해야 한다.
	public Member() {
	
	}
	//메소드
	public void showInfo() {
		//System.out.println("번호:"+A.num+", 이름:"+A.name+", 주소:"+A.addr);
		System.out.println("번호:"+this.num+", 이름:"+this.name+", 주소:"+this.addr);
	}
}
