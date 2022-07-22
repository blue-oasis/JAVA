package 삼성SDS알고리즘.day5;
// 조합 파스칼 삼각형, dp활용
// 입력 a개수 N, z개수 M, 몇번째인지 조건 K
// 주어진 문자 조건 모든 조합을 오름차순으로 정렬했을때 K번째 문자 출력
// 출력 해당하는 조건 순번 문자열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1256_사전_소스공유 {

    static int N, M, K;
    static int[][] dp = new int[201][201];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (K > combination(N + M, M)) {
            System.out.println("-1");
        } else {

        }
    }

    public static void query(int n, int m, int k) {
        // 단어 끝에 도달
        if (n + m == 0) {
            return;
        }
        // z만 남은경우
        else if (n == 0) {
            sb.append('z');
            query(n, m - 1, k);
        }
        // a만 남은경우
        else if (m == 0) {
            sb.append('a');
            query(n - 1, m, k);
        }
        // a, z 둘다 남은 경우 a를 고를 때 조합 수를 보고 판단
        else {
            int leftCount = combination(n + m - 1, m);
            if (leftCount >= k) {
                sb.append('a');
                query(n - 1, m, k);
            } else {
                sb.append('z');
                query(n, m - 1, k - leftCount);
            }
        }
    }

    public static int combination(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else if (dp[n][r] != 0) {
            return dp[n][r];
        } else {
            return dp[n][r] = Math.min((int) 1e9, combination(n - 1, r - 1) + combination(n - 1, r));
        }
    }
}
