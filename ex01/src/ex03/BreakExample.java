package ex03;
import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = in.nextLine();
			
			if(text.equals("exit")) //문자열 비교 시 .equals() 사용
				break; //탈출
		}
		System.out.println("종료합니다...");
		
		in.close();
	}

}
