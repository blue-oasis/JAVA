package 삼성SDS알고리즘.day1;
import java.util.*;
import java.io.*;
// 알파벳으로 암호 만들기 서로 다른 L개의 알파벳 소문자로 구성
// 최소 1개의 모음(a, e, i, o, u)과 2개의 자음으로 구성, 오름차순
// 오름차순 순으로 L길이의 가능성 있는 암호 출력
// 1.체크인 - 방문여부, 오름차순 배열
// 2.목적지? 자+모음 갯수, 
// 3.연결된 곳 0~c or index+1~c
// 4.갈 수 있나? : 방문배열보기/인덱스 확인
// 5. 간다
// 6. 체크아웃
public class 백준1759_암호만들기 {
	
	static int L, C;
	static char[] data;
	static List<String> result;
	

	public static void main(String[] args) throws Exception {
		// 입력 암호길이L, 주어진 알파벳 갯수C
		// 후보 알파벳
		System.setIn(new FileInputStream("src/삼성SDS알고리즘/day1/input2.txt"));
		Scanner in = new Scanner(System.in);
		
		L = in.nextInt();
		C = in.nextInt();
		
		data = new char[C];
		result = new LinkedList<>();
		
		for(int i = 0; i<C; i++) {
			data[i] = in.next().charAt(0);
		}
		
		Arrays.sort(data); //오름차순 정렬
		
		dfs(0, 0, 0, -1, ""); //더미 호출
		
		//1줄씩 출력
		for(String k : result) {
			System.out.println(k);
		}
		
	}

	static void dfs(int length, int ja, int mo, int current, String pwd) {
		//1. 체크인 - 생략 가능
		//2. 목적지인가?: length == L => ja 개수, mo 개수. 암호 가능한지 판별
		if(length == L ) {
			if(ja >= 2 && mo >=1) {
				//정답처리
				result.add(pwd);
			}
		} else {
			//3. 연결된 곳을 순회: current + 1 ~ c
			for(int i = current +1; i<C; i++) {
				//4. 갈 수 있는가?: 다 가능
				//5. 간다 -> ja, mo
				if(data[i] == 'a' || data[i] == 'e' || data[i] == 'i'|| data[i] == 'o' || data[i] == 'u') {
					dfs(length + 1, ja, mo + 1, i, pwd + data[i]);
				} else {
					dfs(length + 1, ja + 1, mo, i, pwd + data[i]);
				}
			}
		}
		
		
		//6. 체크아웃 - 생략 가능
	}
	
}
