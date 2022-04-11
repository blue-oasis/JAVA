package CodingTest;
//자동 줄띄우기 이클립스 : ctrl + shift + f
import java.util.Scanner;

public class 숫자_합_구하기3 {

//더할 숫자는 1자리수 (0~9)까지라고 가정  

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

// do-while을 이용하여 범위 체크하는 방법입니다. 

		int num;

		int sum = 0;

		do {

			System.out.print("더할 숫자의 개수를 입력해 주세요(1~100): ");

			num = in.nextInt();

		} while (num < 0 || num > 100);

// 입력값을 String형 변수 sNum에 저장한 후 char[］형 변수로 변환하기 

		System.out.print("숫자를 띄어쓰기 없이 입력해 주세요 : ");

		String sNum = in.next();

		char[] cNum = sNum.toCharArray();

		for (int i = 0; i < cNum.length; i++) {

			if (i > num - 1)

				break;

			sum += cNum[i] - '0';

		}

		/*
		 * 
		 * char[] c_sumNum = new char[num];
		 * 
		 * 
		 * 
		 * System.out.print("숫자를 띄어쓰기 없이 입력해 주세요 : ");
		 * 
		 * 
		 * 
		 * String sumNum = in.next();
		 * 
		 * 
		 * 
		 * int sum = 0;
		 * 
		 * for(int i = 0; i<c_sumNum.length; i++) {
		 * 
		 * c_sumNum[i] = sumNum.charAt(i);
		 * 
		 * }
		 * 
		 * for(int i = 0; i<c_sumNum.length; i++) {
		 * 
		 * sum += c_sumNum[i] - 48;
		 * 
		 * }
		 * 
		 */

		System.out.println(sum);

		in.close();

	}

}