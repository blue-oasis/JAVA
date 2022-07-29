package 삼성SDS알고리즘.day9;

// dp 점화식 코드공유
/*      7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5
                    // 크기 5 정수 삼각형 예시
 */
// 맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 
// 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 
// 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
// 입력 삼각형 크기 n
// 둘째 줄 부터 n+1번째 줄까지 정수 삼각형 입력
// 출력 합이 최대가 되는 경로에 있는 수의 합 (경로중 최대합 출력)

import java.io.*;
import java.util.*;
public class 백준_1932_정수삼각형 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day9/input_1932.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] triangle = new int[N][N];
        int[][] dp = new int[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int ans = 0;
        //점화식: dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
        dp[0][0] = triangle[0][0];
        for(int i = 1; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                int lt = j-1 < 0 ? 0 : dp[i-1][j-1];
                int rt = dp[i-1][j];
                dp[i][j] = Math.max(lt, rt) + triangle[i][j];
            }
        }
        for(int i = 0; i < N; i++) {
            ans = Math.max(ans, dp[N-1][i]);
        }
        System.out.println(ans);
    }
}