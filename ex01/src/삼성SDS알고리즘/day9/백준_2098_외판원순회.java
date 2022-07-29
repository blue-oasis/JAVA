package 삼성SDS알고리즘.day9;

// 외판원순회(TSP), dp문제
// 방향그래프, 1~N 도시 존재, 사이에 길 존재, 한 도시에서 출발해 모든 도시 순회 계획
// 한번 간 도시 재방문 불가 , 최저비용 코스 구하기
// 도시 이동 비용 행렬 W[i][j] => 도시 i-j가는 비용 / 대칭적이지 않음 / 양의정수
// W[i][i] = 0 // i-j 도시 이동 불가 경우 W[i][j] = 0

// 입력 도시의 수 N (2 ≤ N ≤ 16)
// 다음 N개의 줄에는 비용 행렬 1,000,000 이하의 양의 정수이며, 갈 수 없는 경우는 0
//  W[i][j]는 도시 i에서 j로 가기 위한 비용, 항상 순회 가능한 경로만 주어짐
// 출력 순회에 필요한 최소 비용

import java.io.*;
import java.util.*;
public class 백준_2098_외판원순회 {
    private static final int INF = 16000001; //TSP의 최대값보다 더 큰 값.
    static int N;
    static int[][] adj;
    static int allVisited;
    private static int[][] dp;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day9/input_2098.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        allVisited = (1 << N) - 1;
        adj = new int[N][N];
        dp = new int[16][allVisited];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }
        //0번 정점에서 시작해서 모든 정점 방문 후 다시 0번 정점으로 돌아오는 최소 비용
        //이 때 TSP의 해가 존재하면, 시작정점은 0이 아닌 다른 정점으로 해도 무조건 최적해임이 보장된다. (사이클이기 때문)
        System.out.println(dfs(0, 1));
    }

    //dp[cur][visit] : cur정점에서 visit(bitmask) 만큼 정점을 방문한 상태일 때,
    //                 나머지 정점 모두 방문 후 다시 0번 정점으로 돌아가는 최소비용
    public static int dfs(int cur, int visit) {
        if (visit == allVisited) return adj[cur][0] == 0 ? INF : adj[cur][0];
        if (dp[cur][visit] != -1) return dp[cur][visit];

        dp[cur][visit] = INF;
        for(int i = 0; i < N; i++) {
            int next = 1 << i;
            if(adj[cur][i] != 0 && ((visit & next) == 0)) {
                dp[cur][visit] = Math.min(dp[cur][visit], dfs(i, (visit|next)) + adj[cur][i]);
            }
        }
        return dp[cur][visit];
    }

}