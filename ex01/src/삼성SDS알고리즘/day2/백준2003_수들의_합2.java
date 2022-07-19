package 삼성SDS알고리즘.day2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
// 투포인터/슬라이드 주어진 배열 연속된 위치 합 구하기..
//입력 숫자갯수 N, 목표 수 a
// 숫자배열
// 출력 목표 값 만족하는 경우의 수
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준2003_수들의_합2 {
	static int N, M;
	static int[] nums;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day2/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		nums = new int[N + 1]; // out index 방지 곱일때는 마지막 원소 1로 만들어야함

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0; // 경우의 수 저장
		int s_index = 0; // start 인덱스
		int e_index = 0; // end 인덱스
		int sum = nums[0]; // 합계 계산

		while (true) {
			// sum == M -> 답, low ++
			if (sum == M) {
				count++;
				sum -= nums[s_index++];
			}
			// sum > M => low++
			else if (sum > M) {
				sum -= nums[s_index++];
			}
			// sum < M -> high++
			else {
				sum += nums[++e_index];
			}

			if (e_index == N) {
				break;
			}
		}

		System.out.println(count);
	}
}
