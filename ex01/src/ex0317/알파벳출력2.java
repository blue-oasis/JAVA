package ex0317;

import java.util.Scanner;

public class 알파벳출력2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오.>>");
		String a = in.next();
		char A = a.charAt(0); //문자열 첫자를 A에 저장
		int 숫자변환 = (int)A;
		for(int x = 97; x<=A; x++) { //97~A까지 돌림
				int[]알파벳배열 = new int[(A - x)+1]; //배열 만들어서 넣기 수정중
			for(int j = 0; j<알파벳배열.length; j++) {
				알파벳배열[j] = (char)x;
			}
			
		for(int i =0; i<알파벳배열.length; i++) {
			System.out.print(알파벳배열[i]);
		}
				/*System.out.print((char)i);
				if(i==A) {
					A--;
				}
				if(A == 97) {
					System.out.print("\n" +A);
				}
			
			}*/
		System.out.println();
		//System.out.print((int)A); //문자 형변환
//이건 이상한거
		}

	}
}

