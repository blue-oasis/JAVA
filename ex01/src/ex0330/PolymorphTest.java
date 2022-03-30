package ex0330;
class A {
	int a = 0;
	public void func() {
		System.out.println("a");
	}
}

class B extends A {
	int a = 5;
	public void func() {
		System.out.println("b");
	}
}

class C extends B {
	int a = 10;
	public void func() {
		super.func(); //바로 상위 부모 메소드 호출
		System.out.println(super.a); //바로 상위클래스에 속성이 없으면 그 상위로 감 
	}
}


public class PolymorphTest {

	public static void main(String[] args) {
		C c = new C();
		c.func();
		System.out.println(c.a);
		
	}

}
