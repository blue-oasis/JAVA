package ex0316;

import java.util.Scanner;

public class DevidByZeroHanding {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dividend;
		int divisor;
		
		while(true) {
		System.out.print("나뉨수를 입력하시오: ");
		dividend = in.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = in.nextInt();
		try {
		System.out.println(dividend + "를 " + divisor +"로 나누면 몫은 " + 
		dividend/divisor+ "입니다.");
		break;
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		in.close();
	}
}
