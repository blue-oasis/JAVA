package ex0412;

public class A {
	//접근제어자가 다른 필드 선언
		public int a = 1;
		protected int b = 2;
		int c = 3;
		private int d = 4;
		
	//같은 클래스 내에서는 모두 접근가능	
		public void print() {
			System.out.print(a + " ");
			System.out.print(b + " ");
			System.out.print(c + " ");
			System.out.print(d + " ");
			System.out.println();
		}
		

}
