package 삼성SDS알고리즘.day9;

//코드공유 dp
// N×N개의 수가 N×N 크기의 표에 채워져 있다. 
// (x1, y1)부터 (x2, y2)까지 합을 구하는 프로그램을 작성하시오. (x, y)는 x행 y열을 의미
// 입력 표 크기 N, 연산 수 M |  1 ≤ N ≤ 1024, 1 ≤ M ≤ 100,000
// 다음 줄 부터~N개줄 표에 채워진 수
// 다음 줄 부터 x1 x2 y1 y2
// (x1, y1) ~ (x2, y2) 합 출력


import java.io.*;
import java.util.*;
public class 백준_11660_구간합구하기5 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day9/input_11660.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] dp = new int[N+1][N+1];
        for(int y = 1; y <= N; y++) {
            st = new StringTokenizer(br.readLine());
            int x_sum = 0;
            //dp[y][x] : (1,1) ~ (y,x) 영역의 합
            for(int x = 1; x <= N; x++) {
                x_sum += Integer.parseInt(st.nextToken());
                dp[y][x] = dp[y-1][x] + x_sum;
            }
        }
        StringBuilder sb = new StringBuilder();
        int x1, y1, x2, y2;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            y1 = Integer.parseInt(st.nextToken());
            x1 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            int ans = dp[y2][x2] - dp[y1-1][x2] - dp[y2][x1-1] + dp[y1-1][x1-1];
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}