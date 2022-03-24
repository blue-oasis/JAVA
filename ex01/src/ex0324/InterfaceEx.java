package ex0324;
interface PhoneInterface{
	final int TIMEOUT = 10000; //상수 필드 (public 생락)
	void sendCall(); //추상 메소드 (public abstract 생략)
	void receiveCall();
	default void printLogo() { //디폴드 메소드 (public 생략)
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface{//인터페이스 구현
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다");
	}
	
	public void flash() { //메소드 추가
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
public class InterfaceEx { 

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();

	}

}
