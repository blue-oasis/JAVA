package CodingTest;
import java.util.Arrays;
/* 갖고있는 재료로 만들 수 있는 갑옷 수 구하기
 * 갑옷은 두 개의 재료로 만듦, 중복 사용 불가
 * input 재료 갯수 int, 갑옷 완성되는 수 int, 재료 배열 int
 * output 만들 수 있는 갑옷 갯수
 * 
 * 정렬 후 투포인터(인덱스 양끝)
 */
import java.util.Scanner;

public class 주몽의_명령 {

	public static int gap(int a, int b, int[]c) {
		int answer = 0;
		int i = 0;
		int j = c.length - 1;
		Arrays.sort(c);
		
		while(i < j){
			int sum = c[i] + c[j];
			if(sum < b) {
				i++;
			}
			else if(sum > b) {
				j--;
			}
			else { //값 같을때
				answer++;
				i++;
				j--;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("재료의 갯수를 입력해 주세요 : ");
		int a = in.nextInt();
		int[]c = new int[a];
		
		System.out.print("갑옷이 완성되는 수의 합을 입력해 주세요 : ");
		int b = in.nextInt();
		
		System.out.print("재료들을 띄어쓰기로 구분해 입력해 주세요(" + a + "개) : ");
		for(int i = 0; i<c.length; i++) {
			c[i] = in.nextInt();
		}
		
		int test = gap(a, b, c);
		System.out.println(test);

	}

}
