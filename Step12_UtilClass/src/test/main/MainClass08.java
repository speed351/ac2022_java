package test.main;
/*
 * while문을 활용해서 원하는횟수만큼 반복하기
 * 
 * - 반복 횟수가 명확히 정해져 있으면 for문으로 반복문을 도는게 좋다
 * - 반복 횟수가 명확히 정해져 있지 않고 반복을 돌아봐야 횟수를 아는 경우 while 문으로 반복문을 도는게 좋다.
 * 
 * 
 * 
 */
public class MainClass08 {
	public static void main(String[] args) {
		int count=0;

		//안녕을 5번 찍고 무한루프문 탈출
		while(true) {
			System.out.println("안녕");
			count++;
			if(count==5) {
				break;
			}
		}
		//다시 초기화
		System.out.println("---------------------");
		count = 0;
		while(count<5) {
			System.out.println("안녕2");
			count++;
		}
		
	}
}
