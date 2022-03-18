package ex0318;
import java.util.Scanner;
class CurrencyConverter{
	private static double rate; //환율
	public static double toDoallar(double won) {
		return won/rate; // 원화 달러 변환
	}
	public static double toKWR(double dollar) {
		return dollar * rate; //달러 원화 변환
	}
	public static void setRate(double r) {
		rate = r; //환율설정
	}
}
public class StaticMember {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = in.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $" + CurrencyConverter.toDoallar(1000000) + "입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100)+ "원입니다.");
		in.close();
	}

}
