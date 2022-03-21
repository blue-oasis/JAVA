package ex01;
import java.util.Scanner;
public class 소수구하기_실험 {

	public static void main(String[] args) {
		int 소수 = 50;
		int 라인 = 10;
		int count = 0;
		int number = 2;
		while(count<=소수) {
			boolean isPrime = true;
			int 나누는수 = 2;
			while(나누는수 <=number/2) {
				if (number % 나누는수 == 0) {
					isPrime = false;
					break;
				}
				else{나누는수 += 1;
				}
			}	
			if(isPrime) {
				count += 1;
				
				System.out.print(number);
				if(count % 라인 == 0) {
					System.out.println();
				}
			}
			number +=1;
			
		}
		

	}

}
