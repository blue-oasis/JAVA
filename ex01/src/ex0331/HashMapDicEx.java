package ex0331;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		//(영어, 한글)형태 HashMap
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String eng = in.next();
			if(eng.equals("exit")) { //exit 입력 시 종료
				System.out.println("종료합니다.");
				break;
			}
			String kor = dic.get(eng); //입력한 영어 키값으로 한글값 얻기
			if(kor==null)
				System.out.println(eng + "는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
		in.close();
		
	}

}
