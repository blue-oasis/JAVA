package ex0318;

import java.util.Scanner;

public class 소수구하기3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("소수를 구할 범위 첫번째 양의 정수를 입력해 주세요: ");
		int n = in.nextInt();
		System.out.print("소수를 구할 범위 끝의 양의 정수를 입력해주세요: ");
		int m = in.nextInt();
		int small, big;
		int count =0;
		if(n==m) {
			System.out.print("잘못 입력했습니다.");
			return;
		}
		else if(n>m) {
			big = n;
			small = m;
		}
		else {
			big = m;
			small = n;
		}
		
		boolean[] pn = new boolean[big];
		for(int i =0; i<pn.length; i++) {
			pn[i] = true;
		}
		pn[0] = pn[1] = false;
		
		for(int i =0; i<pn.length; i++) {
			if(pn[i]==true) {
				System.out.print(i +  " ");
				count++;
				if(count%10 == 0) {
					System.out.println();
				}
				for(int j = i*2; j<pn.length; j+=i) {
					pn[j] = false;
				}
			}
		
			
		}
		System.out.print("\n소수의 갯수는 " +  count + "개 입니다.");
	}

}
