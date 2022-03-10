package ex02;
import java.util.Scanner;
public class 계절분류 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12):");
		int s = in.nextInt();
		
		switch(s) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
		}
		/*if (1<=s && 2>=s)
			System.out.println("겨울");
		else if(s==12)
			System.out.println("겨울");
		else if (3<=s && 5>=s)
			System.out.println("봄");
		else if (6<=s && 8>=s)
			System.out.println("여름");
		else if (9<=s && 11>=s)
			System.out.println("가을");
		else 
			System.out.println("잘못 입력하였습니다.");
			if문으로도 해봄~~^^ */
	}
}
