package CodingTest;

public class 신규_아이디_추천3 {
	public static String solution(String new_id) {
        String answer = "";
        String[] sp = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "]", 
        		"{", "}", ":", "?", "<", ">", "/", ","};
       
        answer = new_id.toLowerCase();
        
        for(int i = 0; i < 23 ; i++) {
        	answer = answer.replace(sp[i], "");
        	}
       
        answer = answer.replace("..", ".");
        
       char[] c_id = answer.toCharArray();
        
       /*if(answer.length() > 0) { //수정 필요
        while(true) {	
        		if(answer.indexOf('.') == 0){
        			answer = answer.substring(1, (answer.length()-1));
        		}
        		else {
        			break;
        		}
        	}
        }*/
        
        if(answer.length() > 0) { //수정 필요 answer.substring(1,length -1); indexOf('.') 웨않덴대?!
            while(true) {	
            		if(answer.lastIndexOf('.') == (answer.length()-1)){ //범위체크하래 에러는안나는대 동작이상 
            			if(answer.length()>2){
                        answer = answer.substring(0, (answer.length()-2));
                        }
                        else{
                            break;
                        }
            		}
            		else {
            			break;
            		}
            	}
            }
         
         answer = String.valueOf(c_id); 
         answer = answer.replace(" ", "");
         
         if(answer.equals("")) {
        	 answer = "a";
         }
         
         if(answer.length() >= 16) {
        	 answer = answer.substring(0,15);
        	 c_id = answer.toCharArray(); 
        	 if(c_id[answer.length() - 1] == '.') {
           	  c_id[(answer.length() - 1)] = '\0';
           	  answer = String.valueOf(c_id); 
             }//if() .끝에 있으면 제거
         }
         
         if(answer.length() <= 2) {//2자 이하면 마지막문자를 길이 3까지반복
        	 c_id = answer.toCharArray();
        	 char a = c_id[(answer.length() - 1)];
        	 while(answer.length() < 3) {
        		 answer = answer.concat(String.valueOf(a));
        	 }
         }
        
        return answer;
	}

	public static void main(String[] args) {
		 System.out.println(solution("...!@BaT#*..y.abcdefghijklm")); //bat.y.abcdefghi
		 System.out.println(solution("z-+.^."));
		 System.out.println("123_.def");
		 System.out.println("abcdefghijklmn.p");

	}

}
