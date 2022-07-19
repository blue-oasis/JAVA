package 삼성SDS알고리즘.day2;
// 입력 수열 길이 N, 구하려는 목표값 M
// 수열 (더해서 목표값 돼야함)
// 출력 목표값 만족하는 제알 짧은 길이
// 부분합

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1806_부분합 {
    static int N, M;
	static int[] nums;

    public static void main(String[] args) throws Exception  {
        
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day2/input2.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 수열 갯수
		M = Integer.parseInt(st.nextToken()); //목표값

		nums = new int[N + 1]; // out index 방지 곱일때는 마지막 원소 1로 만들어야함

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

        int count = Integer.MAX_VALUE; // 경우의 수 저장
		int low = 0; // start 인덱스
		int high = 0; // end 인덱스
		int sum = nums[0]; // 합계 계산

        while(true) {
            if(sum >= M) {
                count = Math.min(high - low + 1, count); // 구간 길이 구하기
                sum -= nums[low++];
            }
            else if (sum < M) {
                sum += nums[++high];
            }
           
            if(high == N) {
                break;
            }
        }
        
       
        System.out.println(count);
        //수정필요
    }
}
