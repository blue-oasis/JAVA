package ex0412.chap07.s1;
//A 클래스와 다른 패키지
import ex0412.A;
public class C {
	public void print() {
		A a = new A();
		
		System.out.print(a.a + " ");
		//다른 패키지 내의 클래스에서는 자식 클래스가 아닐 때는 public만 사용
		//System.out.println(a.b + a.c + a.d);
		System.out.println();
	}
	

}
