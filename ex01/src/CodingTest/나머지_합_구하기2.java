package CodingTest;

import java.util.Scanner;
//백업본
public class 나머지_합_구하기2 {

	public static void main(String[] args) {
		int dNum = 0;
		int qNum = 0;
		int answer = 0;
		int nmg[];
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("데이터의 갯수 n, 나눌 수 m을 입력해 주세요(1 <= n <= 106), (2 <= m <= 103): ");
			dNum = in.nextInt(); //데이터 수
			qNum = in.nextInt(); //나누는 수
		}while(dNum <= 1 || dNum > 107 || qNum <= 2 || qNum > 104);
		
		int[] data = new int[dNum+1];

		System.out.println("데이터를 입력해 주세요(0 <= n <= 109) : ");
		for(int i = 1; i<=dNum; i++) {  //구간합 배열 생성
			int check = in.nextInt();
			if((check >= 0) && (check<=109)) { //범위 검사
				data[i] = (check) + data[i-1];
			}
			else {
				System.out.println("숫자 범위(0 <= n <= 109)를 확인하고 다시 입력해주세요 : ");
				i--;
			}
		}
		
		nmg = new int[dNum]; //나머지값 저장 배열 0~dNum-1

		for(int i = 1; i<=dNum ; i++) { // 합배열%나누는 수 연산으로 배열의 값 바꿈
			data[i] = data[i] % qNum;
			
			if(data[i] == 0) { //나머지 0이면 정답수 +1
				answer++;
			}
		}
		
		
	}

}
