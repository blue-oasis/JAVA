package CodingTest;
import java.util.Arrays;
// 시험 본 순서대로 점수 배열 in
//예외처리 점수가 뒤죽박죽일때..?
//점수 뺴서 오름차순으로 만들기
//최소로 뺀만큼 return
public class web_1 {
	
	public static int solution(int[] grade) {
	        //점수차이 카운트 answer
	        int answer = 0;
	        int[] c_grade = grade;
	        
	        int[] test = Arrays.copyOf(c_grade, c_grade.length);
	        Arrays.sort(test); 
	        int small = test[0]; //젤작은값 
	        int small_in = 0;//젤작은값 인덱스
	        //뒤에서부터 훑어서 ????
	        
	        for(int i = 1; i<c_grade.length; i++) { //예외처리 위해 젤작은값 인덱스 구하기
	        	if(c_grade[i] == small) {
	        		small_in = i;
	        		System.out.println(small + " " + small_in);
	        		break;
	        	}
	        }
	        		
	        System.out.println(Arrays.toString(c_grade));
	        
	        for(int i = 1; i<c_grade.length; i++) { //배열수만큼 돌리기
	        	int temp = c_grade[i-1];
	        	int temp2 = c_grade[i];
	        	
	        	while(temp > temp2) {
	        		temp--;
	        		answer++;
	        	}
	        	
	        	if(i < small_in) {
	        		while(temp > small) {
	        			temp--;
	        			answer++;
	        		}
	        	}
	        	
	        	c_grade[i-1] = temp;
	        		
	        }
	        System.out.println(Arrays.toString(c_grade));
	        
	        int[] test2 = Arrays.copyOf(c_grade, c_grade.length);
	        Arrays.sort(test2);
	        if(Arrays.equals(test2, c_grade)) {
	        	;
	        }
	        else {
	        	small = test[0]; //젤작은값 
		        small_in = 0;//젤작은값 인덱스
		        //뒤에서부터 훑어서 ????
		        
		        for(int i = 1; i<c_grade.length; i++) { //예외처리 위해 젤작은값 인덱스 구하기
		        	if(c_grade[i] == small) {
		        		small_in = i;
		        		System.out.println(small + " " + small_in);
		        		break;
		        	}
		        }
	        	
	        	for(int i = 1; i<c_grade.length; i++) { //배열수만큼 돌리기
		        	int temp = c_grade[i-1];
		        	int temp2 = c_grade[i];
		        	
		        	while(temp > temp2) {
		        		temp--;
		        		answer++;
		        	}
		        	
		        	if(i < small_in) {
		        		while(temp > small) {
		        			temp--;
		        			answer++;
		        		}
		        	}
		        	
		        	c_grade[i-1] = temp;
		        		
		        }
	        	
	        }
	        
	        return answer;
	    }

	public static void main(String[] args) {
		int[] test = {1, 2, 5, 4, 3, 4};
		int answer = web_1.solution(test);
		System.out.println(answer);

	}

}
