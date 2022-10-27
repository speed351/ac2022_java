package test.auto;

public class ElectiricCar extends Car{
	//부모객체가생성되기 위해서 필요한 객체를 자식생성자의 생성자로 전달받아서 
	public ElectiricCar(Engine engine) {
		//부모 생성자에 전달을 해 주어야 한다.
		super(engine);
		// TODO Auto-generated constructor stub
	}
	public void charge() {
		System.out.println("충전을 해요");
	}
	
}
