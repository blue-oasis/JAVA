package 삼성SDS알고리즘.day9;

// 코드공유 dp
// 행렬 N개의 크기가 주어졌을 때, 모든 행렬을 곱하는데 필요한 곱셈 연산 횟수의 최솟값을 구하기
// 크기가 N×M인 행렬 A와 M×K인 B를 곱할 때 필요한 곱셈 연산의 수는 총 N×M×K번
// 필요한 곱셈 연산의 수는 행렬을 곱하는 순서에 따라 달라지게 된다.
// A의 크기가 5×3이고, B의 크기가 3×2, C의 크기가 2×6인 경우에 행렬의 곱 ABC를 구하는 경우
// AB를 먼저 곱하고 C를 곱하는 경우 (AB)C에 필요한 곱셈 연산의 수는 5×3×2 + 5×2×6 = 30 + 60 = 90
// BC를 먼저 곱하고 A를 곱하는 경우 A(BC)에 필요한 곱셈 연산의 수는 3×2×6 + 5×3×6 = 36 + 90 = 126

// 입력 행렬의 개수 N (1 ≤ N ≤ 500)
// 둘쨰 줄~N개줄 행렬 크기 r, c (1 ≤ r, c ≤ 500)
// 출력 첫째 줄에 입력으로 주어진 행렬을 곱하는데 필요한 곱셈 연산의 최솟값을 출력
// 정답은 2^31-1 보다 작거나 같은 자연수

import java.io.*;
import java.util.*;
public class 백준_11049_행렬곱셈순서 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day9/input_11049.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] rows = new int[N+1];
        st = new StringTokenizer(br.readLine());
        rows[0] = Integer.parseInt(st.nextToken());
        rows[1] = Integer.parseInt(st.nextToken());
        for(int i = 2 ; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            rows[i-1] = Integer.parseInt(st.nextToken());
            rows[i] = Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[N+1][N+1];

        //j = 구간 시작점
        //i = 구간 종료점
        //k = j <= k < i
        for(int i = 1; i <= N; i++){
            for(int j = i-1; j > 0; j--){
                int min = Integer.MAX_VALUE;
                for(int k = j; k < i; k++){
                    min = Math.min(min, dp[j][k]+dp[k+1][i]+rows[i]*rows[k]*rows[j-1]);
                }
                dp[j][i] = min;
            }
        }
        System.out.print(dp[1][N]);
    }
}
