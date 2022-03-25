package ex0325;
import java.util.*;
public class 선택정렬 { //3월 30일까지 하기 + 이거 간결하게 고치고 선택정렬 알고리즘 따로..
/* 1 .배열로 입력받기, 학점 배열 생성, 2. 학점부여 해시맵에 입력순서대로 원점수 , 널값 입력
 * 3. 배열 오름차순 정렬, 4. 학점부여 해시맵에 for문으로 (오름차순 점수배열값[i], 학점[i])부여
 * 5. for문으로 프린트 해시맵.get(점수[i]) > 입력순 출력???
 */
	public static void main(String[] args) {
		Map<Integer, Integer> 점수2 = new HashMap<Integer, Integer>(); //입력순서, 원점수
		Map<Integer, String> 학점부여 = new HashMap<Integer, String>(); //원점수, 학점
		
		int 점수[] = new int[10]; //원점수 오름차순 정렬용
		String 학점[] = {"F", "D", "D+", "C", "C+", "B", "B+", "A", "A+", "A+"}; //학점배열
		
		Scanner in = new Scanner(System.in);
		System.out.print("10명의 점수를 입력해 주세요(띄어쓰기로 구분) : ");
		for(int i = 0; i<10; i++) { //입력받아서 점수2 해시맵에 입력순서, 원점수 10개 저장
			점수2.put(i, in.nextInt());
		}
		
		for(int i = 0; i<10; i++) { //점수 배열에 점수 저장
			점수[i] = 점수2.get(i);// 10개저장
		}
		
		Arrays.sort(점수); //오름차순 정렬
		
		for(int q = 0; q<10; q++) { //원점수 입력순서대로 키값에 점수 부여, 학점은 null
			학점부여.put(점수2.get(q), null);
		}
		
		for(int w = 0; w <10; w++) { //오름차순 순으로 학점 부여
			학점부여.put(점수[w], 학점[w]);
		}
		/*for(int i = 9; i <=0; i--) {
			int j = 점수2.get(i);
			for(int x = 0; x<i; x++) {
				if(점수2.get(i-1) > )
			}
			
		}
		
		/*for(int i = 0; i<10; i++) {
			점수[i] = in.nextInt(); 10개저장
		}
		
		/*arrays.sort
		Arrays.sort(점수);
		for(int u : 점수 ) {
			System.out.print(u + " ");
		}*/
		
		for(int k = 0; k<10; k++) { //출력문
		
			System.out.print(학점부여.get(점수2.get(k))+ " ");
	}
		in.close();
	}
}