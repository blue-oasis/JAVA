package ex0412;
//A 클래스와 같은 패키지
public class B {
	public void print() {
		A a = new A();
		
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");
		//System.out.println(a.d + " "); private는 사용불가
		System.out.println();
	}
	
	
}
