package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		
		/*
		 * MyObject 객체를 하나만 생성해서 그 객체가 가지고 있는 
		 * walk(), getNumber(), getGreeting() 메소드를 차례대로 호출
		 * 단, 메소드가 어떤 data를 리턴하면 해당 데이터를 지역변수에 담으세요.
		 */
		MyObject mo = new MyObject();
		mo.walk();
		int mo_n = mo.getNumber();
		String mo_s = mo.getGreeting();
		Car car_mo = mo.getCar();
		
		//setNum(), setName(), useCar() 메소드 호출하기
		//메소드 호출하면서 인자로 전달할 데이터를 즉석에서 만들어서 전하기
		mo.setNum(100);
		mo.setName("park");
		mo.useCar(new Car());
		
		// 메소드 호출하면서 인자로 전달할 값이 지역변수에 이미 존재하는 경우라고 가정
		int moSetNum = 100;
		String moSetName="kim";
		Car moSetCar = new Car();
		moSetCar.name="페라리";
		  
		mo.setNum(moSetNum);
		mo.setName(moSetName);
		mo.useCar(moSetCar);
		
		mo.doSomething(moSetNum, moSetName, moSetCar);
		
	}
}
