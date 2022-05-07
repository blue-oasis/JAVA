package CodingTest;

import java.util.Arrays;

/*알고력, 코딩력, 문제배열 입력
 * 문제배열[필요알, 필요코, 얻알, 얻코, 시간]
 * 모든 문제 풀이 가능때까지 걸리는 최소시간 리턴
 */

public class kakao_intern_2번 {
	
	
	public static int solution(int alp, int cop, int[][] problems) {
        int answer = 0;
        int time = 0; //걸리는 시간
        int[] me = {alp, cop}; //나의 능력
        int[][] q = new int[problems.length][2]; //문제 난이도
        
        for(int i = 0; i<q.length; i++) { //문제 난이도 배열 할당
        	for(int j = 0; j<2; j++) {
        		q[i][j] = problems[i][j]; 
        	}
        }
        
        
        
        return answer;
    }

	public static void main(String[] args) {
		

	}

}
