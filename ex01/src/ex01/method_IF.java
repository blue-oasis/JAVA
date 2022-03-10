package ex01;
import java.util.Scanner;

public class method_IF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오.: ");
		int A = scanner.nextInt();
		
		System.out.println((A % 2 == 0)?"짝수 입니다.":"홀수 입니다.");
		//삼항조건식
		
		if (A % 2 == 0) { 
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
		//정수 입력받고 if else 조건식으로 짝수, 홀수 판별
	}

}
