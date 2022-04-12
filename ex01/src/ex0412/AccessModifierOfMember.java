package ex0412;
//서로 다른 패키지에 있는  A, C, D 클래스 임포트
import ex0412.chap07.s1.*;
public class AccessModifierOfMember {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();

		
	}

}
