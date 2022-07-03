package CodingTest;

public class 수박수박 {
	
	    public static String solution(int n) {
	        int su = n/2;
	        String answer = "";
	        while(su > 0){
	            answer = answer + "수박";
	            su--;
	        }
	        
	        if(n%2 == 1) {
	        	answer = answer + "수";
	        }
	        
	        return answer;
	    }
	

	public static void main(String[] args) {
		String answer = solution(7);
		System.out.println(answer);

	}

}
