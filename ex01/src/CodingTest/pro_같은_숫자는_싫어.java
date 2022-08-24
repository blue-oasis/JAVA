package CodingTest;
import java.util.*;
// 입력된 int 배열 중 연속해서 중복되어 나타나는 숫자 제외 후 순서대로 출력
// ex) [1, 1, 2, 3, 1] => [1, 2, 3, 1]
// 중복 다 제거하는거 아님!!!
public class pro_같은_숫자는_싫어 {

	    public int[] solution(int []arr) {
	        int[] answer = {};
	        int count = 1;

	        // arraylist add(리스트 맨 끝에 원소 더하기)
	        // add(index , value)형태로 쓰면 해당 인덱스에 값 넣고 원소들 한칸씩 다 밀림
	        // contains(해당 원소 있는지 bool값 리턴), get(인덱스) 해당 인덱스의 값 출력
	        // set(인덱스, 원소) 인덱스 지정해서 값수정 
	        // remove(인덱스 or 원소) 해당 값 삭제
	        // indexOf(원소) 해당 원소 인덱스 리턴, 없을시 -1

	        ArrayList<Integer> num = new ArrayList<>(); //사이즈 지정 안하고 사용가능
	        num.add(arr[0]);
	       
	        for(int i = 1 ; i < arr.length; i++) {
	            if(num.get(count - 1) == arr[i]) {
	                continue;
	            } 
	            num.add(arr[i]);
	            count++;
	        }
	        
	        answer = new int[num.size()];
	        
	        for (int i = 0; i < num.size(); i++) { 
	            answer[i] = num.get(i);
	        }
	  
	       
	        return answer;
	    }
	
}
