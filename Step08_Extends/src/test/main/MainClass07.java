package test.main;


import test.auto.ElectiricCar;
import test.auto.Engine;
import test.auto.JoCar;

public class MainClass07 {
	public static void main(String[] args) {
		ElectiricCar eCar =  new ElectiricCar(new Engine());
		eCar.drive();
		eCar.charge();
		
		JoCar jcar = new JoCar(new Engine());
		jcar.born();
	}

}
