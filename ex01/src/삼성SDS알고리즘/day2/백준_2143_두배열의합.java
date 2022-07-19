package 삼성SDS알고리즘.day2;
/* 
 * 부배열 - A 부분합 ex) 1 3 2 부배열 (정렬상태) 1 2 3 4 5 6
 *
 * 
 * 입력 목표값 T
 *  A배열 갯수 n
 *  A배열
 *  B배열 갯수 m
 *  B배열
 * 
 * 출력
 * A 부배열 + B 부배열 = T 만족하는 갯수
 */

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;


public class 백준_2143_두배열의합 {
    static long T;
    static int N, M;
	static long[] A, B;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day2/input_2143.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Long.parseLong(br.readLine()); //목표값
		// long으로 다 고치기 ------------------------------------------------------------
        N = Integer.parseInt(br.readLine()); // A배열 크기
		A = new long[N]; // out index 방지 곱일때는 마지막 원소 1로 만들어야함
		StringTokenizer st = new StringTokenizer(br.readLine()); // 1줄 읽어서 토큰라이저 만듦
       
        for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
        
        M = Integer.parseInt(br.readLine()); //B배열 크기
        B = new long[M]; // out index 방지 곱일때는 마지막 원소 1로 만들어야함
		st = new StringTokenizer(br.readLine()); //B배열 만들기
		for (int i = 0; i < M; i++) {
			B[i] = Long.parseLong(st.nextToken());
		}

        List<Long> subA = new ArrayList<>(); //부배열 가변길이
        List<Long> subB = new ArrayList<>();

        //부배열 만들어서 정렬하기 subA, subB
        for(int i = 0; i < N ; i++) {
            long sum = A[i];
            subA.add(sum);
            for(int j = i + 1; j < N; j++) {
                sum += A[j];
                subA.add(sum);
            }
        }

        for(int i = 0; i < M ; i++) {
            long sum = 0;
            for(int j = i; j < M; j++) {
                sum += B[j];
                subB.add(sum);
            }
        }

        //부배열 정렬
        Collections.sort(subA); //오름차순
        Collections.sort(subB, Comparator.reverseOrder()); // 내림차순

       long result = 0;
       int ptA = 0;
       int ptB = 0;

       //메인로직
        while(true) {
            long currentA = subA.get(ptA);
            long target = T - currentA;
            // currentB == target -> subA, subB 같은 수 개수 체크 -> 답구하기, ptA+, ptB+
            if(subB.get(ptB) == target) {
                long countA = 0;
                long countB = 0;

                while(ptA < subA.size() && subA.get(ptA) == currentA) { //부배열 중복처리
                    countA++;
                    ptA++;
                }
                while(ptB < subB.size() && subB.get(ptB) == target) { //부배열 중복처리
                    countB++;
                    ptB++;
                }

                result += countA * countB;
            }
            // currentB > target -> ptB++ B는 내림차순이라 증가시켜 합 줄이기
            else if(subB.get(ptB) > target) {
                ptB++;
            }
            // currentA < target -> ptA++ A증가시켜 합 크게 만들기
            else {
                ptA++;
            }

            //탈출 조건
            if(ptA == subA.size() || ptB == subB.size()) {
                break;
            }

        }

        System.out.println(result);

}
}
