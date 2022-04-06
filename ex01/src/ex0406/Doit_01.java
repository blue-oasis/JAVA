package ex0406;

public class Doit_01 {
 //자료형 복습. float와 double 정밀도 비교
	public static void main(String[] args) {
		//float = 대략 소수 7자리
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		//double = 대략 소수 15자리
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.00000000000000001;
		System.out.println(d2);

	}

}
