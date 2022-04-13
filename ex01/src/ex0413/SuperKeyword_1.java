package ex0413;
//맴버 앞에 있는 참조 변수를 생략(this)했을 때의 메서드 호출 실습

class Su {
	void abc() {
		System.out.println("Su 클래스의 abc()");
	}
}

class Ex extends Su {
	void abc() {
		System.out.println("Ex 클래스의 abc()");
	}
	void bcd() {
		abc();
	}
}
public class SuperKeyword_1 {

	public static void main(String[] args) {
		Ex e = new Ex();
				
		e.bcd();		

	}
}
