package ex0316;
import java.util.Scanner;
public class DivideByZero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("나뉨수를 입력하시오: ");
		dividend = in.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = in.nextInt();
		System.out.println();
		System.out.println(dividend + "를" + divisor +"로 나누면 몫은" + 
		dividend/divisor+ "입니다.");
		
		in.close();

	}

}
