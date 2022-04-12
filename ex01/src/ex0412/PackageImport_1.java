package ex0412;
//외부 패키지의 클래스 사용 방법 1(클래스의 풀네임 사용) 실습
public class PackageImport_1 {

	public static void main(String[] args) {
		// 다른 패키지의 클래스를 사용할 때는 패키지명을 포함한 풀네임을 사용해야 한다.
		//객체 생성
		ex0411.ClassA a = new ex0411.ClassA();
		
		//맴버 활용
		System.out.println(a.n);
		System.out.println(a.m);
		
		a.print();
	}

}
