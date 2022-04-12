package ex0412;
//외부 패키지의 클래스 사용 방법 2(임포트 구문사용) 실습
import ex0411.ClassA;
public class PackageImport_2 {

	public static void main(String[] args) {
		//객체 생성
		ClassA a = new ClassA();
		//맴버활용
		System.out.println(a.n);
		System.out.println(a.m);
		
		a.print();

	}

}
