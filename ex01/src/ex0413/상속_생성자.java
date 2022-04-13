package ex0413;
class 부모 {
	부모(){
		System.out.println("부모클래스 생성자");
	}
}

class 자식 extends 부모{
	자식(){
		System.out.println("자식 클래스 생성자"); //자동으로 super()추가
	}
	
	자식(int a){
		this();
		System.out.println(a + "자식 클래스 생성자2");
	}
	
	자식(int a, int b){
		this();
		System.out.println(a + b + "자식 클래스 생성자2");
	}
}
public class 상속_생성자 {

	public static void main(String[] args) {
		부모 a = new 부모();
		자식 b = new 자식();
		자식 c = new 자식(1);
		자식 d = new 자식(1, 2);
	}

}
