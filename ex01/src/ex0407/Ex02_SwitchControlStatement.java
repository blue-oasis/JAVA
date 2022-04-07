package ex0407;

public class Ex02_SwitchControlStatement {

	public static void main(String[] args) {
		//break문 없음
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();
		
		//break문 있음
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println();
		
		if(value1 ==1) {
			System.out.println("A");
		}
		else if(value1 ==2) {
			System.out.println("B");
		}
		else if(value1 ==3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}
}
