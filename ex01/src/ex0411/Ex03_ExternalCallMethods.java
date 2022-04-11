package ex0411;

class A3{
	void print(){
		System.out.println(("안녕"));
	}
	
	int data() {
		return 3;
	}
	
	double sum(int a, double b) {
		return a+b;
	}
	
	void printMonth(int m) {
		if(m<0 || m >12) {
			System.out.println("잘못된 입력");
		}
		System.out.println(m+ "월입니다.");
	}
}
public class Ex03_ExternalCallMethods {

	public static void main(String[] args) {
		A3 a = new A3();
		a.print();
		int k = a.data();
		System.out.println(k);
		double result = a.sum(9, 5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);

	}

}
