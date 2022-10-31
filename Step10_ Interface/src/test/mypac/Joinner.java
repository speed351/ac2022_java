package test.mypac;


//추상 메소드를 1개만 만들도록 강제하는 역할을 하는 코드 @FunctionalInterface
// ()->{} 형태로 사용할 수 있게 보장하는 역할
@FunctionalInterface
public interface Joinner {
	public String join(String one, String two);
	//하나가 아니게 되면 에러발생
	//public void test();
}
