package ex0317;
import java.util.Scanner;
public class 알파벳출력 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오.>>");
		String a = in.next();
		char A = a.charAt(0); //문자열 첫자를 A에 저장
		int 숫자변환 = (int)A;
		for(int x = 97; x<=A; x++) { //97~A까지 돌림
			for(int i = 97; i<=A ; i++) {
				System.out.print((char)i);
				if(i==A) {
					A--;
				}
				if(A == 97) {
					System.out.print("\n" +A);
				}
			
			}
		System.out.println();
		//System.out.print((int)A); //문자 형변환

		}

	}
}