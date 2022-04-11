package ex0411;
//기본자료형 입력 매개변수 값의 변화 실습
public class Ex06_EffectOfPrimaryDataArgumen {

	public static void main(String[] args) {
		int a = 3; //main 지역변수
		int result1 = twice(3);
		System.out.println(result1);
		
		int result2 = twice(a);//main 지역변수
		System.out.println(result2);
		System.out.println(a);//main 지역변수

	}
	
	public static int twice(int a) {
		a = a * 2;
		return a;
	}

}
