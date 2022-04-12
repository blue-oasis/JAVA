package CodingTest;
import java.util.Scanner;
public class 구간_합_구하기 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("데이터의 갯수, 질의 갯수를 입력해 주세요: ");
		int dNum = in.nextInt(); //데이터 수
		int qNum = in.nextInt(); //질의 수
		
		int[] data = new int[dNum+1];

		System.out.println("데이터를 입력해 주세요 : ");
		for(int i = 1; i<=dNum; i++) {  //구간합 배열 생성
			data[i] = (in.nextInt()) + data[i-1];
		}
		
		System.out.println("질의를 입력해 주세요 : ");
		for(int i = 0; i<qNum; i++) { //1 3 입력시 data[3] - data[0]
			int q = in.nextInt();
			int q2 = in.nextInt();
			System.out.println(data[q2] - data[q-1]);
		}
		
		in.close();
		
	}

}
