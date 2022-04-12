package ex0412.chap07.s1;
import ex0412.A;
public class D extends A{
	public void print() {
		System.out.print(a + " ");
		System.out.print(b + " ");
		//자식 클래스는 다른 패키지에 있어도 protected 접근가능
		//System.out.print(c + d);
		System.out.println();
	}
}
