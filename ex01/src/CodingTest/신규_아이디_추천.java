package CodingTest;


public class 신규_아이디_추천 {
	
	public static String solution(String new_id) {
        String answer = "";
        String[] sp = {"~", "!", "@", "#", "$", "%", "^", "&", "\\*", "\\(", "\\)", "=", "\\+", "\\[", "\\]", 
        		"\\{", "\\}", ":", "\\?", "<", ">", "/", ","};
        /*대문자-소문자 toLowerCase()
        알파벳 소문자, 숫자, -, _, .만 남김 (-_.~!@#$%^&*()=+[{]}:?,<>/)
        ..연속 .로 치환 0
        . 처음이나 끝이면 제거0
        빈문자면 a 추가 0
        16자 이상이면 15개로 짜름 substring(0,14)
         if 제거 후 .이 끝에있으면 제거
        2자 이하면 마지막문자를 길이 3까지반복 */
        answer = new_id.toLowerCase();
        
        for(int i = 0; i < 23 ; i++) {
        	answer = answer.replace(sp[i], "");
        	}
       
        answer = answer.replace("..", ".");
        
        char[] c_id = answer.toCharArray();
        
        if(c_id.length != 0) { //수정 필요 
         while(c_id[0] == '.'){
        	c_id[0] = ' ';
        	answer = String.valueOf(c_id);
        	c_id = answer.toCharArray();
         }
        }
        
        if(c_id.length != 0) {
          while(c_id[answer.length() - 1] == '.') {
        	 c_id[(answer.length() - 1)] = ' ';
        	 answer = String.valueOf(c_id);
          	 c_id = answer.toCharArray();
          }
         }
         answer = String.valueOf(c_id); 
         answer = answer.replace(" ", "");
         
         if(answer.equals("")) {
        	 answer = "a";
         }
         
         if(answer.length() >= 15) {
        	 answer = answer.substring(0,14);
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
		 

	}

}
