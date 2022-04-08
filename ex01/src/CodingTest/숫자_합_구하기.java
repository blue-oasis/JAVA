package CodingTest;
import java.util.Scanner;
public class 숫자_합_구하기 {
//더할 숫자는 1자리수 (0~9)까지라고 가정
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] c_sumNum;
		int num;
		int sum = 0;
		boolean check = false;
		boolean c2 = true; //숫자 갯수, 띄어쓰기 여부 검사
		
		while(true) {
			System.out.print("더할 숫자의 개수를 입력해 주세요(1~100): ");
			num = in.nextInt();

			if(num>0 && num<=100) { //범위 검사
				c_sumNum = new char[num];
				break;
			}
			else {
				System.out.print("범위 오류 : 숫자를 다시 입력해 주세요\n");
			}
		}
		
		System.out.print("숫자를 띄어쓰기 없이 입력해 주세요 : ");
		do {
			
			String sumNum = in.next();
			
			//숫자 갯수 검사
			if(sumNum.length() == num) {
				for(int i = 0; i<c_sumNum.length; i++) {
					c_sumNum[i] = sumNum.charAt(i);			
				}
				c2 = false;
				}
			
			if(c2) {
				System.out.println("갯수가 일치하지 않거나 공백이 있습니다. 다시 입력하세요");
			}
			
			} while(c2);
			
			
		//48('0')~57('9') 숫자인지 검사
		for(int i = 0; i<c_sumNum.length; i++) {
			if(c_sumNum[i]>47 && c_sumNum[i]<58) {
				check = true;
			}
			else {
				check = false;
				break;
			}
		}
		
		if(check){
		for(int i = 0; i<c_sumNum.length; i++) {
			sum += c_sumNum[i] - 48;	
		}
		System.out.println(sum);
		}
		else {
			System.out.println("숫자가 아닌 값이 입력되었습니다. 종료합니다.");
		}
		in.close();
	}

}
