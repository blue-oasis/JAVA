package ex0413;
//인터페이스 내의 정적 메서드 실습

interface St{
	static void abc() {
		System.out.println("St 인터페이스의 정적 메서드 abc()");
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		//정적 메서드 호출
		St.abc();

	}

}
