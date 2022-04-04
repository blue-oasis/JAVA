package ex0331;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>(); //문자열 ArrayList
		
		Scanner in = new Scanner(System.in);
		for(int i = 0; i <4; i++) { //4개 문자열 입력 받기
			System.out.print("이름을 입력하세요>>");
			String s = in.next();
			a.add(s);
		}

		for(int i = 0; i<a.size(); i++) { //리스트의 모든 이름 출력
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		int longestIndex = 0;
		for(int i = 1; i<a.size(); i++) { //가장 긴 이름 출력
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n 가장 긴 이름은 : " + a.get(longestIndex));
		
		in.close();
	}
	

}
