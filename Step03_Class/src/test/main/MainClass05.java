package test.main;

import test.mypac.Rect;

/*
 * test.mypac 패키지에 Rect라는 이름의 클래스를 만들고자 한다.
 * 해당 클래스로 객체를 새엇앟고 사각형의 폭과 높이를 필드에 대입하고
 * showArea()를 호출하면 사각형의 넓이가 콘솔창에 출력될 수 있도록 설계하라
 */

public class MainClass05 {
	public static void main(String[] args) {
		Rect rect= new Rect();
		
		rect.width = 10.5;
		rect.height = 11.3;
		
		rect.showArea();
		
	}
}