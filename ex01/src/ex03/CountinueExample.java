package ex03;
import java.util.Scanner;
public class CountinueExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요" );
		int sum = 0;
		for(int i = 0; i<5; i++) {
			int n = in.nextInt(); //n에 정수 입력받음
			if(n<=0)
				continue; //음수인 경우 더하지 않고 다음반복으로 진행
			else
				sum += n;
		}
		System.out.println("양수의 합은 " + sum);
		
		in.close();
	}

}
