package 삼성SDS알고리즘.day1;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
//남극언어 읽기 input 단어 갯수n 배울 단어수 k, 단어 목록,output 최대로 읽을 수 잇는 단어 수
// a c n t i 는 무조건 배우기 (고정)
// k개의 글자를 가르칠 때 학생들이 읽을 수 있는 단어 개수 최대값 출력
// 깊이우선탐색
// 연결된 곳 : 모든 알파벳/ 갈 수 있는 곳: 안배운거
// 1. 체크인 2. 목적지인가? : 깊이 == k
// 3. 연결된 곳 순회 4. 갈 수 있나?:방문x곳 5. 간다. 6.체크아웃
public class 백준_1062_남극 {
	
	static int n, k;
	static String[] words;
	static boolean[] visited; //방문했나 보기
	static int selectedCount = 0;
	static int max = 0;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/삼성SDS알고리즘/day1/input.txt"));
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		
		words = new String[n];
		visited = new boolean[26];
		visited['a' - 'a'] = true; //무조건 배워야하는거 처리
		visited['n' - 'a'] = true;
		visited['t' - 'a'] = true;
		visited['i' - 'a'] = true;
		visited['c' - 'a'] = true;
		
		for(int i = 0; i<n; i++) {
			words[i] = in.next().replaceAll("[antic]", ""); //필수요소 날리기
		}
		
		System.out.println(Arrays.toString(words));
		selectedCount = 5;
		max = countWords();
		
		for(int i =0; i <26; i++) {
			if(visited[i] == false) {
				Dfs(i); //Dfs 호출
			}
		}
		
		System.out.println(max);
		
		//System.out.println(fib(4)); 피보나치 예시
	}
	
	//알파벳을 숫자 인덱스로 치환(a = 0, z = 25)
	
	static void Dfs(int index) {
		//1. 체크인
		visited[index] = true;
		selectedCount++;
		//2. 목적지인가? selectedCount == k ==>읽을 수 있는 단어 개수 계산
		if(selectedCount == k) {
			//계산
			max = Math.max(max, countWords());
		} else {
			//3. 연결된 곳을 순회 : index + 1 ~ 25
			for(int i = index + 1; i <= 25; i++) {
				//4. 갈 수 있는가? 방문여부
				if(visited[i] == false) {
					//5. 간다 Dfs()
					Dfs(i);
				}
			}
			
		}
		
		//6. 체크아웃
		visited[index] = false;
		selectedCount--;
		
		
	}
	
	static int countWords() { //단어 읽을 수 있나 갯수 세기
		int count = 0;
		for(int j =0; j <n; j++) {
			boolean isPossible = true;
			String word = words[n-1];
			for(int i = 0; i<word.length(); i++) {
				if(visited[word.charAt(i) - 'a'] == false){
					isPossible = false;
					break;
				}
			}
			if (isPossible) {
				count++;
			}
		}
		return count;
	}
	
/*static int fib(int n) { //피보나치 재귀호출
		if(n==1 || n == 2) {
			return 1;
		}
		
		return fib(n-1) + fib(n-2);
	} */

}
