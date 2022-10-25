package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	public void showInfo() {
		//System.out.println("번호:"+A.num+", 이름:"+A.name+", 주소:"+A.addr);
		System.out.println("번호:"+this.num+", 이름:"+this.name+", 주소:"+this.addr);
	}
}
