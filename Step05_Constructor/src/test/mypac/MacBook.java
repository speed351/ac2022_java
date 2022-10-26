package test.mypac;

public class MacBook {
	//외부에서 접근 불가능 하도록 접근지정자를 private로 해서 필드 3개 선언
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
	public MacBook() {
		//기본 생성자
	}
	
	//메소드
	public void doGame() {
		if(this.cpu==null||memory==null||hardDisk==null) {
			System.out.println("부품이 부족해서 맥북이 동작을 할 수 없습니다");
			return;
		}
		System.out.println("신나게 게임을 해요");
	}
}
