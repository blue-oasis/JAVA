package CodingTest;
/* 좋은 수 = 주어진 숫자 목록 중에 목록의 수 2 개를 합해서 나오면 좋은 수
 * 입력 int 숫자 갯수 = 1~2000, 숫자 목록 
 * 출력 int 좋은 수 갯수
 * 왜 index 오류 나오지 - 이동 원칙 준수, 슈도코드 맹신 ㄴㄴㄴ
 */

import java.util.Arrays;

public class 좋은_수_찾기 {
	
	public static int goodNum(int a, int[] b) {
		int answer = 0;
		
		Arrays.sort(b);
		
		for(int i = 0; i<b.length; i++) {
			int k = b[i];
			int start = 0;
			int end = (b.length - 1);
			int sum = 0;
			
			while(start < end){
	
				sum = b[start] + b[end];
			
				if(k == sum) {
					
					if(b[start] != k && b[end] != k) {
						answer++;
						break;
					}
					else {
						start++;
						end--;
					}
					
				}
				
				else if(k > sum) {
					start++;
				}
				
				else {
					end--;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int answer = goodNum(10, numbers);
		
		System.out.print(answer);
	}

}
