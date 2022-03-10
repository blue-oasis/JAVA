package ex02;
import java.util.Scanner;
public class 돈교환 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("금액을 입력하시오.");
		int won = in.nextInt();
		int fiveMan = won / 50000;
		int man = (won % 50000)/10000;
		int cwon = ((won % 50000) % 10000) / 1000;
		int bak =(((won % 50000) % 10000)%1000) / 100;
		int 오십 = ((((won % 50000) % 10000)%1000) % 100) / 50;
		int 십 = (((((won % 50000) % 10000)%1000) % 100) % 50) / 10;
		int 일 = ((((((won % 50000) % 10000)%1000) % 100) % 50) % 10);
		System.out.println("오만원권 " + fiveMan +"매" );
		System.out.println("만원권 " + man +"매" );
		System.out.println("천원권 " + cwon +"매" );
		System.out.println("백원권 " + bak +"개" );
		System.out.println("오십원 " + 오십 +"개" );
		System.out.println("십원 " + 십 +"개");
		System.out.println("일원 " + 일 +"개" );
		
		in.close();
	}

}
