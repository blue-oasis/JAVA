package ex0325;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 선택정렬2 {

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
		
		for(int i = 점수.length-1; i>=0; i--) { //선택정렬 알고리즘 (오름차순)
			int 끝수 = 점수[i];
			for(int x = 0; x<i-1; x++) {
				int 비교수 = 점수[x];
				if(비교수>끝수) {
					int swap = 0;
					swap = 끝수;
					끝수 = 비교수;
					비교수 = swap;
					점수[i] = 끝수;
					점수[x] = 비교수;
				}
				
			}
		}
		
		for(int q = 0; q<10; q++) { //입력순서대로 키값에 원점수 부여, 학점은 null
			학점부여.put(점수2.get(q), null);
		}
		
		for(int w = 0; w <10; w++) { //오름차순 순으로 학점 부여
			학점부여.put(점수[w], 학점[w]);
		}
		
		for(int k = 0; k<10; k++) { //출력문 점수2의 키값(입력순서) 이용 입력순대로 학점 출력
		
			System.out.print(학점부여.get(점수2.get(k))+ " ");
	}
		in.close();
	}

}
