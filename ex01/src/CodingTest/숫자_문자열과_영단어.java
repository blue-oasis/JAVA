package CodingTest;
import java.util.Scanner;
//replace("C#", "JAVA") 문자열 바꾸기
//replaceAll(String, String) 정규표현식 사용 가능 
//replaceAll[abc, "굿"] ->문자열의 a, b, c 각문자 모두 굿 변환
//replaceAll[^abc, "굿"] - >문자열의 a, b, c 빼고 다 굿 변환
public class 숫자_문자열과_영단어 {
	public static int solution(String s) {
		int answer = 0;
		String[] al = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};   
		
		for(int i = 0; i < 10; i++) {
			s = s.replace(al[i], String.valueOf(i));
		}

        answer = Integer.parseInt(s);
        return answer;
        
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("변환할 문자열을 입력해 주세요");
		String temp = in.next();
		//String s = "one4seveneight";
		System.out.println(solution(temp));
	}

}
