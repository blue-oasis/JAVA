package ex01;
import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("화씨 온도: ");
		double F = scanner.nextDouble();
		
		double C = (F - 32) * 5/9;
		System.out.print("섭씨 온도: " + C);
		
		scanner.close();
	}

}
