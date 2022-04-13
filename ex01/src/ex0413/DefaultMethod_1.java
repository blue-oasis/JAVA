package ex0413;
//인터페이스 구현 및 디폴트 메서드의 오버라이딩 실습

interface In7{
	void abc();
	default void bcd() {
		System.out.println("In7 인터페이스의 bcd()");
	}
}

class cla implements In7{
	public void abc() {
		System.out.println("cal 클래스의 abc()");
	}
}

class cla1 { 
	public void abc() {
		System.out.println("cal1 클래스의 abc()");
	}
	
	public void bcd() {
		System.out.println("cal1 클래스의 bcd()");
	}
}

public class DefaultMethod_1 {

	public static void main(String[] args) {
		cla a1 = new cla();
		cla1 a2 = new cla1();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();


	}

}
