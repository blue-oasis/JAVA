package CodingTest;
/*mbti변형 문제
 * 입력1 문제 유형 (RT, CF, JM, AN) 앞에꺼 비동의 뒤에 동의
 * 입력2 사용자 대답 (1~7)
 * 점수 매칭 매우아님 1~매우맞음7 4는 0점
 * 리턴 사용자가 얻는 타입 문자열
 * 최종제출본
*/

import java.util.Arrays;

class Solution {
    public static String solution(String[] survey, int[] choices) {
    	String answer = "";
        int[] type = new int[4];
        // RT CF JM AN 양수나 0면 앞타입 음수면 뒤타입 숫자매핑

        String[] s_type = {"RT", "CF", "JM", "AN"};
        //출력용 type 배열
        
        	for(int i = 0; i<survey.length; i++){
        		char temp = survey[i].charAt(0);//문제 유형 앞자따기
        		int temp2 = choices[i]; //사용자 입력
        		int temp3 = 0; //계산용
        		    
        		 switch(temp) {
        		    case 'R' : 
        		    	temp3 = type[0];
        		        temp3 += -4 + temp2;
        		        type[0] = temp3;
        		        break;
        		    case 'T' : 
        		    	temp3 = type[0];
        		        temp3 += 4 - temp2; 
        		        type[0] = temp3;
        		        break;
        		    case 'C' : 
        		    	temp3 = type[1];
        		        temp3 += -4 + temp2;
        		        type[1] = temp3;
        		        break;
        		    case 'F' : 
        		    	temp3 = type[1];
        		        temp3 +=  4 - temp2;
        		        type[1] = temp3;
        		        break;
        		    case 'J' : 
        		    	temp3 = type[2];
        		        temp3 += -4 + temp2;
        		        type[2] = temp3;
        		        break;
        		    case 'M' : 
        		    	temp3 = type[2];
        		        temp3 += 4 - temp2;
        		        type[2] = temp3;
        		        break;
        		    case 'A' : 
        		    	temp3 = type[3];
        		        temp3 += -4 + temp2;
        		        type[3] = temp3;
        		        break;
        		    case 'N' : 
        		    	temp3 = type[3];
        		        temp3 += 4 - temp2;
        		        type[3] = temp3;
        		        break;
        		    //이하동일
        		    }
        		
        		}
        		
        		for(int i = 0; i < type.length; i++) {
        			int temp = 0; //타입값 저장
        			temp = type[i];
        			if(temp > 0) { //양수면 뒤
        				answer += s_type[i].charAt(1);
        			}
        			else { //음수나 0이면 앞
        				answer += s_type[i].charAt(0);
        			}
        		}
        		        
        return answer;
    }
}

public class kakao_intern_1 {

	public static void main(String[] args) {
		String[] test = {"TR", "RT", "TR"};
		int [] test2 = {7, 1, 3};
		String a = Solution.solution(test, test2);
		String t = "";
		t += "a";
		t+= "b";
		System.out.println(a);
//왜안대지 ㅠㅠ
	}

}
