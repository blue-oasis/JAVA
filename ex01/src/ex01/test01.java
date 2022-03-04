package ex01;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcom!!");
		System.out.println("자바 세계로 오신 것을 환영합니다.");
		
		int a =10;
		int b =20;
		int c = a + ++b; // 증감연산 테스트
		System.out.print(c);
		
		int D = 3, E = 5;
		//삼항 연산자 바로 출력 테스트
		System.out.println("\n두 수의 차는 " + ((D>E)?(D-E):(E-D)));
		
			}

}
