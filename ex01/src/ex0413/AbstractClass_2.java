package ex0413;
//추상 클래스의 객체 생성 - 익명 이너 클래스

abstract class AB {
	abstract void abc();
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		AB a1 = new AB() {
			void abc() {
				System.out.println("익명 이너 클래스 방법으로 객체 생성");
			}
		}; //객체 생성
		
		AB a2 = new AB() {
			void abc(){
				System.out.println("객체 생성 시 마다 정의 필요");
			}
		};
		
		a1.abc();
		a2.abc();

	}

}
