package CodingTest;
/*대문자-소문자 toLowerCase()
알파벳 소문자, 숫자, -, _, .만 남김 (-_.~!@#$%^&*()=+[{]}:?,<>/)
..연속 .로 치환 0
. 처음0이나 끝이면 제거 >>이게 문제
빈문자면 a 추가 0
16자 이상이면 15개로 짜름 substring(0,15)
 if 제거 후 .이 끝에있으면 제거
2자 이하면 마지막문자를 길이 3까지반복 */
public class 신규_아이디_추천3 {
	public static String solution(String new_id) {
        String answer = "";
        String[] sp = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "]", 
        		"{", "}", ":", "?", "<", ">", "/", ","};
       
        answer = new_id.toLowerCase();
        
        for(int i = 0; i < 23 ; i++) {
        	answer = answer.replace(sp[i], "");
        	//answer = answer.replace("..", "."); //넣기?
        	}
      
        while(answer.indexOf("..")!= -1) {
        answer = answer.replace("..", "."); 
       }
       
       char[] c_id = answer.toCharArray();
       int count = 0;
	
       for(int i = 0 ; i<answer.length(); i++) { //.만 있으면 고장
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
			 //이거 이상함 끝에 . 제거
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
		 System.out.println(solution("z-+.^.")); //z-- z-.로나옴!!!!
		 System.out.println(solution("123_.def")); 
		 System.out.println(solution("abcdefghijklmn.p")); //abcdefghijklmn
		 System.out.println(solution("=.=")); //aaa
		 System.out.println(solution("****")); //aaa
		 System.out.println(solution("1!!3!!.!!.!.."));
		 
	}

}
