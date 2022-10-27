package test.main;

import java.util.Random;

public class JackPot {
	public static void main(String[] args) {
		String[] item = {"cherry", "apple", "banana", "melon", "7"};
		
		Random rand = new Random();
		//1개의 문자열이 랜덤하게 출력
		System.out.println("1번 문제");
		System.out.println(item[rand.nextInt(5)]);
		System.out.println();
		
		System.out.println("2번 문제");
	
		int chr, app, ban, mel, sev, bar_num;
		chr = app = ban = mel = sev = bar_num =0;
		String picked_item;
		// item 뽑기, item 개수 count, 구분선 count
		for(int i=0;i<3;i++) {
			picked_item = item[rand.nextInt(5)];
			if(picked_item=="cherry") {
				bar_num++;
				chr++;
				System.out.print(picked_item);
			}else if(picked_item=="apple") {
				bar_num++;
				app++;
				System.out.print(picked_item);
			}else if(picked_item=="banana") {
				bar_num++;
				ban++;
				System.out.print(picked_item);
			}else if(picked_item=="melon") {
				bar_num++;
				mel++;
				System.out.print(picked_item);
			}else if(picked_item=="7") {
				bar_num++;
				sev++;
				System.out.print(picked_item);
			}
			
			// 구분선 출력
			if(bar_num<3) {
				System.out.print(" | ");
			}else {
				System.out.println();
			}
			
			//당첨 출력
			if(chr==3) {
				System.out.println("cherry * 3 당첨");
			}else if(app==3) {
				System.out.println("apple * 3 당첨");
			}else if(ban==3) {
				System.out.println("banana * 3 당첨");
			}else if(mel==3) {
				System.out.println("melon * 3 당첨");
			}else if(sev==3) {
				System.out.println("777 잭팟 당첨");
			}else if(i==2) {
				System.out.println("꽝 입니다.");
			}
		
		
		}
	}
}
