package ex01;
import java.util.Scanner;

public class OperatorN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("분자를 입력하시오: ");
		int A = scanner.nextInt();
		System.out.print("분모를 입력하시오: ");
		int B = scanner.nextInt();
		//분자 분모 정수 입력받아 할당
		
		System.out.println("나눗셈의 몫 = " + A / B);
		System.out.print("나눗셈의 나머지 = " + A % B);
		// 나눗셈 연산, 나머지 연산
		
		scanner.close();
	}

}
