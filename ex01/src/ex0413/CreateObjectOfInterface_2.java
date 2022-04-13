package ex0413;
//익명 이너클래스 활용 인터페이스 객체 생성
interface In6{
	int a = 3; 
	void abc();
}

public class CreateObjectOfInterface_2 {

	public static void main(String[] args) {
		//객체 생성
		In6 a1 = new In6() {
			@Override
			public void abc() {
				System.out.println("익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		a1.abc();

	}

}
