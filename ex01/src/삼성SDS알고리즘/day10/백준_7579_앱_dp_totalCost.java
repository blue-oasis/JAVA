package 삼성SDS알고리즘.day10;

// dp[totalCost] 버전
// 앱 실행시 필요 메모리 확보/이전 실행했던 앱 최대한 적게 종료시켜 최적화
// 입력 현재 활성화 앱 수 N, 총 메모리 바이트 M
// 둘째 줄 N개 정수 활성화 앱 사용중 메모리수 M
// 셋째 줄 N개 정수 앱 비활성화 비용 c
// 출력 메모리 M 바이트를 확보하기 위한 앱 비활성화의 최소의 비용 
// 1 ≤ N ≤ 100, 1 ≤ M ≤ 10,000,000이며, 1 ≤ m1, ..., mN ≤ 10,000,000
// 0 ≤ c1, ..., cN ≤ 100이고, M ≤ m1 + m2 + ... + mN

import java.io.*;
import java.util.*;
public class 백준_7579_앱_dp_totalCost {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day10/input_7579.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dp[], m[], c[], N, M, totalCost = 0;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        m = new int[N];
        c = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            m[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            c[i] = Integer.parseInt(st.nextToken());
            totalCost += c[i];
        }
        dp = new int[totalCost + 1];
        //dp[cost] = 앱들을 활성화한 비용이 cost일 때 확보한 최대 메모리 바이트 수
        for (int i = 0; i < N; i++) {
            //만약 c[0] -> totalCost 순으로 진행한다면, i번째 app을 여러 번 사용하는 결과 발생.
            //역순으로 진행해야 dp[j-c[i]]는 i번째 app을 사용하지 않은 cost임이 보장된다.
            for (int j = totalCost; j >= c[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - c[i]] + m[i]);
            }
        }
        int ans = -1;
        for (int i = 0; i <= totalCost; i++) {
            if (dp[i] >= M) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}