package CodingTest;

import java.util.Scanner;

public class 구간_합_구하기2 {

	public static void main(String[] args) {
		int dNum = 0;
		int qNum = 0;
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("데이터의 갯수, 질의 갯수를 입력해 주세요(0 < n < 100001): ");
			dNum = in.nextInt(); //데이터 수
			qNum = in.nextInt(); //질의 수
		}while(dNum <= 0 || dNum > 100000 || qNum <= 0 || qNum > 100001);
		
		int[] data = new int[dNum+1];

		System.out.println("데이터를 입력해 주세요(0<= n <=1000) : ");
		for(int i = 1; i<=dNum; i++) {  //구간합 배열 생성
			int check = in.nextInt();
			if((check >= 0) && (check<=1000)) {
				data[i] = (check) + data[i-1];
			}
			else {
				System.out.println("숫자 범위(0<= n <=1000)를 확인하고 다시 입력해주세요 : ");
				i--;
			}
		}
		
		System.out.println("질의를 입력해 주세요 : ");
		for(int i = 0; i<qNum; i++) { //1 3 입력시 data[3] - data[0]
			int q = in.nextInt();
			int q2 = in.nextInt();
			if((q>0 && q<=dNum) && (q2>0 && q2<=dNum)) {
				System.out.println(data[q2] - data[q-1]);
			}
			else {
				System.out.println("숫자 범위(1 <= n <= "+ dNum + ")를 확인하고 다시 입력해주세요 : ");
				i--;
			}
		}
		
		in.close();
		
	}

}


