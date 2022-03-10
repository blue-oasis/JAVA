package ex02;
import java.util.Scanner;
public class 원화달러환전 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)");
		double won = in.nextInt();
		System.out.print((int)won +"원은 "+ "$" + (won/1200) +"입니다.");
		in.close();
	}

}
