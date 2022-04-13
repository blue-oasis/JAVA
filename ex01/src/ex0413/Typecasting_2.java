package ex0413;
//선언 타입에 따른 사용할 수 있는 멤버 실습

class A1{
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}

class B1 extends A1{
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}
public class Typecasting_2 {

	public static void main(String[] args) {
		A1 aa = new A1();
		System.out.println(aa.m);
		aa.abc();
		
		B1 bb = new B1();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();

		//A타입 B생성자 : 다형적 표현
		A1 ab = new B1();
		System.out.println(ab.m);
		ab.abc();
	}

}
