package CodingTest;

import java.util.Scanner;

public class 나머지_합_구하기 {

	public static void main(String[] args) {
		int dNum = 0; //데이터 수
		int qNum = 0; //나누는 수
		int answer = 0; //답
		int nmg[]; //나머지값 저장 배열
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("데이터의 갯수 n, 나눌 수 m을 입력해 주세요(1 <= n <= 106), (2 <= m <= 103): ");
			dNum = in.nextInt(); //데이터 수
			qNum = in.nextInt(); //나누는 수
		}while(dNum < 1 || dNum > 107 || qNum < 2 || qNum > 104);
		
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
		
		nmg = new int[qNum]; //나머지값 저장 배열, 인덱스 0~dNum-1

		for(int i = 1; i<=dNum ; i++) { // 합배열%나누는 수 연산으로 나머지값 저장 배열 생성
			int temp = data[i] % qNum;
			nmg[temp] += 1; //나머지값에 해당하는 인덱스 넘버에 수 카운트
			if(data[i] % qNum == 0) { //나머지 0이면 정답수 +1
				answer++;
			}
		}
		
		for(int i = 0; i<qNum; i++) { //경우의 수 계산 공식
			answer += nmg[i] * (nmg[i] -1) /2;
		}
		
		System.out.println(answer);
		
		in.close();
	}

}
