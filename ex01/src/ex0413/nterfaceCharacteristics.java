package ex0413;
//인터페이스 내 필드 및 메소드 제어자 실습

interface In {
	public static final int a = 3;
	public abstract void abc();
}

interface In2 {
	int b = 4; //생략 시 자동 public static final 추가
	void bcd(); //생략 시 자동 public abstract 추가
}

public class nterfaceCharacteristics {

	public static void main(String[] args) {
		//static 자동추가, 인터페이스 이름으로 바로 접근
		System.out.println(In.a);
		System.out.println(In2.b);
		
		//A.a = 3; 불가. 상수

	}

}
