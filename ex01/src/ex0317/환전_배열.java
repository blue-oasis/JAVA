package ex0317;

import java.util.Scanner;

public class 환전_배열 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("금액을 입력하시오.");
		int won = in.nextInt();
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환전 배열
		int[] 환전수 = new int[8];
		
		for(int i = 0; i<unit.length; i++) {
			for(int j = 0; j<환전수.length; j++) {
			환전수[j] = won / unit[i];
			won %= unit[i];
			
			}
		}	
		/*int 오만 = won / 50000;
		won %= 50000;
		int 만 = won / 10000;
		won %= 10000;
		int 천 = won / 1000;
		won %= 1000;
		int 백 = won / 100;
		won %= 100;
		int 오십 = won / 50;
		won %= 50;
		int 십 = won / 10;
		won %= 10;
		int 일 = won / 1;
		*/
		System.out.println("오만원권 " + 환전수[0] +"매" );
		System.out.println("만원권 " + 환전수[1] +"매" );
		System.out.println("천원권 " + 환전수[2] +"매" );
		System.out.println("백원권 " + 환전수[3]+"개" );
		System.out.println("오십원 " + 환전수[4] +"개" );
		System.out.println("십원 " + 환전수[5] +"개");
		System.out.println("일원 " + 환전수[6] +"개" );
		
		in.close();
		}	
	}


