package ex02;

public class ForSample {

	public static void main(String[] args) {
		int sum = 0;
		//1~10까지 덧셈
		for(int i = 1; i <=10; i++) {
			sum += i;
			System.out.print(i);
			
			if(i<=9) {
				System.out.print("+");  //1~9까지 + 출력
			}
			else {
				System.out.print("=");  //10되면 =, 결과(sum) 출력
				System.out.print(sum);
			}
		}

	}
	
}
