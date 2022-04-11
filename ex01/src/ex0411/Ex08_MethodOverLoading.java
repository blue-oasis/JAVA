package ex0411;

public class Ex08_MethodOverLoading {

	public static void main(String[] args) {
		//메소드 오버로딩 실습
		// 서로 다른 시그너처를 지니고 있는 print() 메서드를 입력 매개변수에 따라 호출
		print();
		print(3);
		print(5.8);
		print(2, 5);
	}

	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void print(double a) {
		System.out.println(a);
	}
	
	public static void print(int a, int b) {
		System.out.println("a: " + a + "b: " + b);
	}
	
}
