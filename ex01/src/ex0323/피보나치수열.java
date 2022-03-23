package ex0323;
import java.util.Scanner;
public class 피보나치수열 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("10~100 사이의 기간을 입력해 주세요 : ");
		int month = in.nextInt();
		
		int sum = 0;
		int n = 0;
		int n2 = 1;
		int count = 0;
		
			
		for(int i = 0 ; i<month; i++) {
			if( i == 0) {
				n = 0;
				System.out.print(n+"\t");
				n2 = 1;
				System.out.print(n2+"\t");
				count+=2;
				}
			//피보나치 수열
			n = n2;
			n2 = sum;
			sum = n+n2;
				if(sum>=2147483647) {
					System.out.print("\n정수 범위를 넘었습니다.");
					i = month;			
				}
				else {
					System.out.print(sum+"\t");
					count++;	
				}
				
			if(0 == count%10) { //줄바꾸기
				System.out.println();
			}
			
			}
		in.close();
		}
		
		
	}



