package 삼성SDS알고리즘.day10;

// dp, 비트마스크 코드
// 멀쩡한 발전소 사용해서 발전소 고치기
// 입력 발전소 개수 N <= 16
// 둘째 줄부터 N개의 줄에는 발전소 i를 이용해서 발전소 j를 재시작할 때 드는 비용 i j 비용<=36
// 그 다음 줄에는 각 발전소가 켜져있으면 Y, 꺼져있으면 N
// 마지막 줄 p => 고장난 발전소는 적어도 p개 이하  | 0 <= p <= N
// 출력 발전소를 고치는 비용의 최솟값, 불가능할 경우 -1 

import java.io.*;
import java.util.*;

public class 백준_1102_발전소 {
    static final int MAXN = 1000;
    static int N, P, X;
    static int D[][], dp[];
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day10/input_1102.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        dp = new int[1<<N];

        Arrays.fill(dp, -1);

        D = new int[N+1][N+1];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                D[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sts = 0;
        String str = br.readLine();
        for (int i = 0; i < N; i++) {
            char c = str.charAt(i);
            if(c == 'Y') sts |= 1 << i; 
        }
        P = Integer.parseInt(br.readLine());
        int ans = dfs(sts);
        bw.write(((ans > 999999) ? -1 : ans) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int bit_count(int sts) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if ((sts & (1 << i)) > 0) cnt++;
        }
        return cnt;
    }

    public static int min_path(int sts, int to) {
        int ret = 999999;
        for (int from = 0; from < N; from++) {
            if ((sts & (1 << from)) > 0) {
                ret = Math.min(ret, D[from][to]);
            }
        }
        return ret;
    }

    public static int dfs(int sts) {
        int cost;
        if (bit_count(sts) >= P) return 0;
        if (dp[sts] != -1) return dp[sts];
        dp[sts] = 9999999;
        for (int to = 0; to < N; to++) {
            if ((sts & (1 << to)) == 0) {
                cost = min_path(sts, to);
                dp[sts] = Math.min(dp[sts], dfs(sts | (1 << to))+cost);
            }
        }
        return dp[sts];
    }
}
