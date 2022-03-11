package ex03;

import java.util.Scanner;

public class 별_피라미드2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("별을 그릴 칸 수를 입력해 주세요:");
		int n = in.nextInt();
			for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<(n*2)-1; j++) {
			
				if(i==n-1||i+j == n-1|| j-i==n-1) { //i4행, j4열 그리고 (1,3)(2,2)(3,1)찍기
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
		}
		System.out.println();

		in.close();
	}
	}
	
}
