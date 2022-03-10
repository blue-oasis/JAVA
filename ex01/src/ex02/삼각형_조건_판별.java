package ex02;
import java.util.Scanner;
public class 삼각형_조건_판별 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오.");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if ((a+b) > c && (a+c) > b && (b+c) > a ) 
			System.out.println("삼각형이 됩니다.");
		else
		System.out.println("삼각형이 되지 않습니다.");
	
		in.close();

	}

}
