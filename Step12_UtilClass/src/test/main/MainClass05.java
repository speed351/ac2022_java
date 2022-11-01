package test.main;

import java.util.ArrayList;
import java.util.List;

import test_mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값 members라는 지역변수에 담기
		//2. 3명의 회원정보를 Member 객체에 각각 담기
		//3. 위에서 생성된 Member 객체의 참조갑을 members list 객체에 모두 담기
		//4. member List 객체에 담긴 내용을 아래와 같은 형식으로 출력하기
		// 번호 : 1, 이름 : xx , 주소 : yy
		List<Member> members = new ArrayList<>();
		
		members.add(new Member(1,"kim","seoul"));
		members.add(new Member(2,"lee","busan"));
		members.add(new Member(3,"park","jeju"));
		
		for(Member m:members){
			System.out.println("번호 : "+m.num+", 이름 : "+m.name+", 주소 : "+m.addr);
		}
	}
}
