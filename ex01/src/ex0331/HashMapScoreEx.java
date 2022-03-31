package ex0331;
import java.util.*;
public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<>();
		//(이름, 점수) HashMap
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : " + javaScore.size());
		
		Set<String> keys = javaScore.keySet(); //키 set 리턴
		
		Iterator <String> it = keys.iterator(); //key set에 Iterator 인터페이스 사용
		//레퍼런스 it = 키.iterator() 객체생성 return
		while(it.hasNext()) { //방문할 요소가 있으면 true
			String name = it.next(); //다음 요소 읽기 (키값)
			int score = javaScore.get(name); //키값 이용 점수 접근 
			System.out.println(name + " : " + score);
		}
	}

}
