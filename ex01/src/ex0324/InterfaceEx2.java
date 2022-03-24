package ex0324;
interface PhoneInterface2{
	final int TIMEOUT = 10000; //상수 필드 (public 생락)
	void sendCall(); //추상 메소드 (public abstract 생략)
	void receiveCall();
	default void printLogo() { //디폴드 메소드 (public 생략)
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface extends PhoneInterface2{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MP3Interface, MobilePhoneInterface{
	//추상 메소드 구현
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	public void sendSMS() {
		System.out.println("문자 갑니다.");
	}
	public void receiveSMS() {
		System.out.println("문자 왔어요.");
	}
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	//추가 작성 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}

}
