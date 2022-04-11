package ex0411;
//클래스 생성
class A1{
	int m = 3;
	int n = 4;
	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j = 4;
		System.out.println((i + 1));
	}
}
public class Ex01_FieldComponen {

	public static void main(String[] args) {
		A1 a = new A1();
		//필드 호출
		System.out.println(a.m);
		System.out.println(a.n);
		//메소드 호출
		a.work1(); //work1() 안에 정의된 지역 변수를 스택 메모리에 추가

	}

}
