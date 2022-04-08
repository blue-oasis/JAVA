package CodingTest;

import java.util.Scanner;

public class 숫자_합_구하기2 {

		//더할 숫자는 1자리수 (0~9)까지라고 가정
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			String sumNum; //더할숫자 문자열
			char[] c_sumNum; //더할숫자 문자배열
			int num; //숫자갯수
			int sum = 0; //합
			boolean check = false; //숫자여부
			boolean c2 = true; //숫자 갯수, 띄어쓰기 여부 검사
			boolean check3 = false;
					
			System.out.print("더할 숫자의 개수를 입력해 주세요(1~100): ");
			num = in.nextInt();
			do {
				check3 = false;
				if(num>0 && num<=100) { //범위 검사
					c_sumNum = new char[num];
				}
				else {
					System.out.print("범위 오류 : 숫자를 다시 입력해 주세요\n");
					num = in.nextInt();
					check3 = true;
				}
			}while(check3);
			
			System.out.print("숫자를 띄어쓰기 없이 입력해 주세요 : ");
			sumNum = in.next();
			
			
			/*while(true) {
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
				
				sumNum = in.next();
				
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
			in.close();*/
		}
	}


