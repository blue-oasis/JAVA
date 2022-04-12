package ex0412;

class A1{
	void abc() {
		System.out.println("instance 메서드");
	}
	
	static void bcd() {
		System.out.println("static 메서드");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		//인스턴스 메서드(객체생성)
		A1 a1 = new A1();
		a1.abc();
		
		//정적 메서드
		//1. 클래스명으로 바로 접근
		A1.bcd();
		//2. 객체생성 후 사용(권장하지 않음)
		A1 a2 = new A1();
		a2.bcd();

	}

}
