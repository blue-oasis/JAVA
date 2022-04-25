package CodingTest;
//input 스테이지 갯수 N, 유저가 머무는 중인 스테이지 int[] stages
//return 스테이지 번호(실패율 내림차순) 실패율 같으면 작은 스테이지 먼저
//실패율 = 못깬 유저 수 / 깬 유저수

import java.util.Arrays;
import java.util.Collections;

public class 실패율_구하기 {
	
	public int[] solution(int N, int[] stages) {
		 int[] answer = new int[N];
	        answer = new int[N];
	        Double[] fail = new Double[N]; //실패율 저장	
	        
	        for(int i = 0; i<N; i++) {
	        	int count = 0;
	        	double A = 0; //실패율 인자 1 실패유저수
	        	double B = 0; //실패율 인자 2 도전유저수
	        	for(int j = 0; j<stages.length; j++) {
	        		if(i + 1 == stages[j]) {
	        			A++;
	        			B++;
	        		}
	        		else if(i + 1 < stages[j]) {
	        			B++;
	        		}
	        		else {
	        			count++;
	        		}
	        	}
	        	fail[i] = A/B;
	        	if(count == stages.length) {
	        		fail[i] = 0.0; //도달 0명일때 실패율 0
	        	}
	        }
	        
	        //Double Collections.reverseOrder()
	        //실패율 기준 스테이지 내림차순 출력
	        Double [] fail_D = new Double[N]; //내림차순
	        for(int i = 0; i < fail.length; i++) {
	        	fail_D[i] = fail[i];
	        }
	       
	        Arrays.sort(fail_D, Collections.reverseOrder()); //내림차순 정렬
	       
	        for(int i = 0; i<N; i++) { //같은 값 있을때 인덱스 제대로 구하기..? indexOf(값, 시작위치)
	        	int ch = Arrays.asList(fail).indexOf(fail_D[i]) + 1;
	        	int ch2 = Arrays.asList(answer).indexOf(ch);
	        	if(ch2 != -1) {
	        		String a2 = Arrays.toString(answer);
	        		answer[i] = a2.indexOf(ch, i+1); //이상한데??
	        		//answer[i] = Arrays.asList(fail).indexOf(fail_D[i], i) + 1; 스트링으로 바꿀가
	        	}
	        	answer[i] = Arrays.asList(fail).indexOf(fail_D[i]) + 1;
	        	//바로 안넣고 한번 검사해서 ?
	        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		

	}

}
