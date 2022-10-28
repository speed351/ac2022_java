package test.mypac;

//동물원 클래스 
public class Zoo {
	public class Monkey{
		public void say() {
			System.out.println("dance monkey");
		}
	}
	public class Tiger{
		public void say() {
			System.out.println("tiger generation");
		}
	}
	
	//메소드
	public Monkey getMonkey() {
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}

