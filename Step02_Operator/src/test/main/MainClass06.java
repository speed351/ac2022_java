package test.main;
/*
 * 6. 3항연산자 테스트
 * 
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait = false;
		//isWait이 true이면 "기대려요"가 대입되고, false면 "기다리지 않아요"가 대입된다.
		String result = isWait ? "기다려요" : "기다리지 않아요";
			
		System.out.println(result);
		
		//위의 3항연산자는 아래와 같이 if ~ else문과 같은 로직이다
		String result2 = null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
	}
}
