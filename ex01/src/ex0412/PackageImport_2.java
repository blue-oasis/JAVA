package ex0412;
//외부 패키지의 클래스 사용 방법 2(임포트 구문사용) 실습
import ex0412.chap07.s1.A; //패키지.클래스 생성시 .으로 구분해 하위경로 생성가능
public class PackageImport_2 {

	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		//맴버활용
		System.out.println(a.n);
		System.out.println(a.m);
		
		a.print();

	}

}
