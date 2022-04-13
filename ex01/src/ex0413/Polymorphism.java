package ex0413;
//상속을 이용한 객체의 다형적 표현
class A3 {}
class B3 extends A3{}
class C3 extends B3{}
class D3 extends B3{}

public class Polymorphism {

	public static void main(String[] args) {
		//A3 타입의 다형적
		A3 a1 = new A3();
		A3 a2 = new B3();
		A3 a3 = new C3();
		A3 a4 = new D3();
		
		//B3 타입의 다형적
		//B3 b1 = new A3(); 오류
		B3 b2 = new B3();
		B3 b3 = new C3();
		B3 b4 = new D3();
		
		//C3 타입의 다형적 표현
		//C3 c1 = new A3(); 오류
		//C3 c2 = new B3();
		C3 c3 = new C3();
		//C3 c4 = new D4();
		
		//D3 타입의 다형적
		//D3 d1 = new A3(); 오류
		//D3 d2 = new B3();
		//D3 d3 = new C3();
		D3 d4 = new D3();
		
	}

}
