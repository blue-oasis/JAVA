package ex0413;
class A{}
class B extends A{}
class C extends B{}
class D extends B{}
public class Typecasting_1 {

	public static void main(String[] args) {
		//업캐스팅 -캐스팅 구문 생략 시 컴파일러가 자동변환
		A ac = (A) new C();
		B bc = (B) new C();
		
		B bb = new B();
		A a = (A) bb;
		
		//다운캐스팅(수동 변환) 
		A aa = new A();
		//B b = (B) aa; 오류 A-B
		//C c = (C) aa; 오류 A-C
		
		A ab = new B();
		B b = (B) ab; 
		//C c = (C) ab; 오류  A-C
		
		B bd = new D();
		D d = (D) bd;
		
		A ad = new D();
		B b1 = (B)ad;
		D d1 = (D) ad;		
				
	}

}
