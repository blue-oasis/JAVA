package CodingTest;
//input 스테이지 갯수 N, 유저가 머무는 중인 스테이지 int[] stages
//return 스테이지 번호(실패율 내림차순) 실패율 같으면 작은 스테이지 먼저
//실패율 = 못깬 유저 수 / 깬 유저수
//최종 제출본
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class 실패율_구하기2 {
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		Map<Integer, Double> fail = new HashMap<Integer, Double>(); //스테이지, 실패율
		
		double[] fail_D = new double[N]; //실패율 저장	
	        
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
	        	fail_D[i] = A/B;
	        	if(count == stages.length) {
	        		fail_D[i] = 0.0; //도달 0명일때 실패율 0
	        	}
	        }
	        
	        for(int i = 0; i<N; i++) { //스테이지, 실패율 맵핑
	        	fail.put(i+1, fail_D[i]);
	        }
		
	        List<Entry<Integer, Double>> fail_list = new ArrayList<Entry<Integer, Double>>(fail.entrySet());
	        
	        Collections.sort(fail_list, new Comparator<Entry<Integer, Double>>() {
				// compare로 값을 비교
				public int compare(Entry<Integer, Double> obj1, Entry<Integer, Double> obj2)
				{
					// 내림 차순으로 정렬
					return obj2.getValue().compareTo(obj1.getValue());
				}
			});
	        
	      
	        int i = 0; //인덱스 탐색용
	        for(Entry<Integer, Double> entry : fail_list) {
	        		answer[i] = entry.getKey();
	        		i++;
			}
	        
	        return answer;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
