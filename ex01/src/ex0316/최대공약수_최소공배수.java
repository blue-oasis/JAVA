package ex0316;
import java.util.Scanner;
public class 최대공약수_최소공배수 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		long a = in.nextLong();
		System.out.print("두 번째 정수를 입력하세요: ");
		long b = in.nextLong();
		long big = 0;
		long small = 0;
		if(a<b) {
			small = a;
			big = b;
		}
		else {
			big = a;
			small= b;	
		}
		long gcm = 0;
		long lcm = 0;
		long nmg = 0;
		while(true) {
			
			nmg = big%small;
			
			if(nmg == 0) {
				gcm = small;
				lcm = a*b / gcm;
				System.out.printf("최대공약수 = %d \n최소공배수 = %d", gcm, lcm);
				break;
			}
			else {
				big = small;
				small = nmg;
			}
			
			
		}
		in.close();
	
		
		

	}

}
