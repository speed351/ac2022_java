package test.main;

import java.util.ArrayList;
import java.util.List;

import test_mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car type을 저장할 수 있는 ArrayList 객체를 생성해서 참조값을 List 인터페이스 type 지역변수 cars에 담기
		
		List<Car> cars = new ArrayList<Car>();
		
		//2. Car 객체(3개)를 생성해서 List 객체에 저장하기
		
		cars.add(new Car("bus"));
		cars.add(new Car("taxi"));
		cars.add(new Car("truck"));
		
		//3. 반복문 for를 사용해서 List 객체에 저장된 모든 Car 객체의 drive()메소드를 호출하기
		for(Car tmp:cars) {
			tmp.drive();
		}
		System.out.println("---------------");
		cars.forEach((item)->{
			item.drive();
		});
	}
}
