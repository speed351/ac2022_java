package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		String str = "abcde12345";
		int result = str.length();
		char result2 = str.charAt(5);
		String str2 = str.toUpperCase();
		/*
		 * String 객체의 메소드를 활용해서
		 * str 변수안에 있는 문자를 모두 대문자로 변환해서
		 * str2라는 변수에 담아보세요
		 */
		String greet="Hello! mimi, Bye mimi";
		// 위의 문자열에서 mimi라는 문자열을 mamam라는 문자열로 교체해서 결과를 greet2에 담아보세요
		// 단 String 객체의 메소드를 활용해서
		
		String greet2=greet.replace("mimi", "mama");
		
		
		String message = "My name is Kimgura";
		/*
		 * 1. 위의 문자열이 My라는 문자열로 시작하는지 여부를 isStart에 담기
		 * 
		 * 2. 위의 문자열에서 i가 몇번째인덱스에 위치하는지 index변수에 담기
		 * 
		 */
		
		boolean isStart = message.startsWith("My");
		int index = message.indexOf("i");
		
	}
}
