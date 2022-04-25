package CodingTest;
//제출 답안 +7
public class 신규_아이디_추천4 {
	 public String solution(String new_id) {
         String answer = "";
        String[] sp = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "]", 
        		"{", "}", ":", "?", "<", ">", "/", ","};
       
        answer = new_id.toLowerCase();
        
        for(int i = 0; i < 23 ; i++) {
        	answer = answer.replace(sp[i], "");
        	}
      
        while(answer.indexOf("..")!= -1) {
        answer = answer.replace("..", "."); 
       }
       
       char[] c_id = answer.toCharArray();
       int count = 0;
	
       for(int i = 0 ; i<answer.length(); i++) { 
			if(c_id[i] == '.') {
				count++;
				if(c_id.length == 1) {
					answer = "";
				}
			}
			else {
				answer = answer.substring(count, answer.length());
				break;
			}
		}
       
        c_id = answer.toCharArray();
		
		if(answer.length()>1) {
				if(c_id[answer.length()-1] == '.') {
					answer = answer.substring(0, answer.length()-1);		
				}
		} 
       
        
         
         if(answer.equals("")) {
        	 answer = "a";
         }
         
         if(answer.length() >= 16) {
        	 answer = answer.substring(0,15);
        	 c_id = answer.toCharArray(); 
        	 if(c_id[answer.length()-1] == '.') {
					answer = answer.substring(0, answer.length()-1);		
        	 }
         }
         
         if(answer.length() <= 2) {
        	 c_id = answer.toCharArray();
        	 char a = c_id[(answer.length() - 1)];
        	 while(answer.length() < 3) {
        		 answer = answer.concat(String.valueOf(a));
        	 }
         }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
