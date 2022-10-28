package test.main;

import java.util.Random;
import java.util.Scanner;

import test.mypac.Rnum;

public class BaseBall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] target_num = new int[3];
		

		
		
		//중복없는 무작위 세자리 숫자 뽑기
		for(int i = 0; i < target_num.length ; i++) {
			target_num[i]  = rand.nextInt(1,10);
			for(int j = 0; j < i; j++) {
				if(target_num[i] == target_num[j]) {
					i--;
				}
			}			
		}
		
		
		
		
		
		System.out.print(target_num[0]);
		System.out.print(target_num[1]);
		System.out.println(target_num[2]);
		
		// 맞춰야할 숫자를 담을 변수 세팅
		int guess1, guess2, guess3;
		guess1 = guess2= guess3 = 0;
		int n = 1;
		
		
		// 다 맞출때까지 반복문 : !(guess1==target_num[0] && guess2==target_num[1] && guess3==target_num[2])
		// 9회까지만
		while(n<10) {
			// 적중 결과를 보여줄 변수 선언
			int strike = 0;
			int ball = 0;
			
			System.out.println(n+"회 시작");
			//만약 한자리수가 아닌 여러 자리수를 입력한다면 다시 입력하도록 처리
			System.out.println("정확한 한자리 정수를 입력해주세요.");
			System.out.print("첫번째자리 예상 숫자를 입력해주세요 : ");
			guess1 = scan.nextInt();
			while(guess1>10 || guess1 < 0) {
				System.out.println("정확한 한자리 정수를 입력해주세요.");
				System.out.print("첫번째자리 예상 숫자를 입력해주세요 : ");
				guess1 = scan.nextInt();
			}
			
			System.out.print("두번째자리 예상 숫자를 입력해주세요 : ");
			guess2 = scan.nextInt();
			//만약 한자리수가 아닌 여러 자리수를 입력한다면 다시 입력하도록 처리
			while(guess2>10 || guess2 < 0 || guess1 == guess2) {
				System.out.println("정확하고 중복되지 않는 한자리 정수를 입력해주세요.");
				System.out.print("두번째자리 예상 숫자를 입력해주세요 : ");
				guess2 = scan.nextInt();
			}
			
			
			System.out.print("세번째자리 예상 숫자를 입력해주세요 : ");
			guess3 = scan.nextInt();
			//만약 한자리수가 아닌 여러 자리수를 입력한다면 다시 입력하도록 처리
			while(guess3>10 || guess3 < 0 || guess2 == guess3 || guess3 == guess1) {
				System.out.println("정확하고 중복되지 않는 한자리 정수를 입력해주세요.");
				System.out.print("세번째자리 예상 숫자를 입력해주세요 : ");
				guess3 = scan.nextInt();
			}
			
			
			
			// 첫번째 숫자의 strike, ball 판정
			if(guess1==target_num[0]) {
				strike++;
			}else if(guess1==target_num[1] || guess1==target_num[2]) {
				ball++;
			}
			// 두번째 숫자의 strike, ball 판정
			if(guess2==target_num[1]) {
				strike++;
			}else if(guess2==target_num[0] || guess2==target_num[2]) {
				ball++;
			}
			
			// 세번째 숫자의 strike, ball 판정
			if(guess3==target_num[2]) {
				strike++;
			}else if(guess3==target_num[0] || guess3==target_num[1]) {
				ball++;
			}
			
			if(strike==3) {
				System.out.println("입력한 숫자는 : " +guess1+"" + guess2+"" +guess3);
				System.out.println("정답은 : "+target_num[0]+""+target_num[1]+""+target_num[2]);
				System.out.print(strike + " strike , ");
				System.out.println(ball + " ball");
				System.out.println("★☆★☆★☆★☆★☆★☆정답입니다! 승리했습니다!★☆★☆★☆★☆★☆★☆★☆");
				break;
			}
			System.out.println("입력한 숫자는 : " +guess1+"" + guess2+"" +guess3);
			System.out.print(strike + " strike , ");
			System.out.println(ball + " ball");
			System.out.println(n+"회 종료");
			System.out.println("-----------------------------------");
			n++;
			
			if(n==10) {
				System.out.println("정답은 : "+target_num[0]+""+target_num[1]+""+target_num[2]+"였습니다.");
				System.out.println("★☆★☆★☆★☆기회를 모두 사용했습니다! 패배했습니다!★☆★☆★☆★☆★☆");
				System.out.println("정답은 : "+target_num[0]+""+target_num[1]+""+target_num[2]+"였습니다.");
				break;
			}
			
		}
		System.out.println("종료");
		
	}
}
