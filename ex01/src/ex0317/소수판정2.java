package ex0317;

import java.util.Scanner;
public class 소수판정2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("소수를 구할 범위 첫번째 양의 정수를 입력해 주세요: ");
		int n = in.nextInt();
		System.out.print("소수를 구할 범위 끝의 양의 정수를 입력해주세요: ");
		int m = in.nextInt();
	
		int count = 0; //소수 총갯수 카운트
		int line = 10; //라인 개행
		boolean real = false; //소수 여부 파악
		int y = 2; //y나누는 수 2~m-z
		for(int z = n ;z<=m; z++) { //z 나눠지는 수, 작은수부터 시작
			int nmg = 0;//나머지 저장
			real = true;
			for(int x =2; x<z; x++) {
				//x 나누는수 2~z
				nmg = z%x;
				if(nmg == 0) {
					real = false;
				}
				
			}
			if(real) {
				System.out.print(z + " ");
				count++;
			}
			if(0==count%line) {
				System.out.println();
			}

	}
		System.out.print("\n소수의 갯수는 " +  count + "개 입니다.");
	}

	}


