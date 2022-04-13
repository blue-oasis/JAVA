package ex0413;
//자식 클래스의 부모 인터페이스의 디폴트 메서드 호출 실습

interface F {
	default void abc() {
		System.out.println("F 인터페이스의 abc()");
	}
}

class cal2 implements F{
	public void abc() {
		F.super.abc(); //부모 인터페이스의 메소드 abc 호출
		System.out.println("cla2 클래스의 abc()");
	}
}
public class DefaultMethod_2 {

	public static void main(String[] args) {
		cal2 c = new cal2();
		
		c.abc();

	}

}
