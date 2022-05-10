package CodingTest;
/* 투포인터 활용
 * 입력받은 숫자를 연속된 숫자의 합으로 나타낼 수 있는 경우의 수 출력
 */
import java.util.Scanner;

public class 연속된_자연수_합 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
	
		int count = 1; //경우의 수 저장
		int s_index = 1; //start 
		int e_index = 1; //end
		int sum = 1; //합계 계산
		
		
		while(e_index < num) {
			if(sum == num) {
				count++;
				e_index++;
				sum += e_index;	
			}
			else if(num < sum) {
				sum -= s_index;
				s_index++;
			}
			else if(num > sum) {
				e_index++;
				sum += e_index;
			}
		} //ㅎㅎㅎㅎ문제를 잘보자
		
		System.out.println("연속된 숫자의 합으로 " + num + "가 나오는 경우의 수는? : " + count);

	}

}
