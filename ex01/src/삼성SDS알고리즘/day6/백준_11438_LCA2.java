package 삼성SDS알고리즘.day6;
//가장 가까운 공통조상 출력
// 정점은 1~N번 번호, 루트 1번
// 입력 노드개수 N
// N-1개줄에 연결된 정점 주어짐
// 그 다음줄 가장 가까운 공종조상 탖는 쌍 개수 M
// M개줄에 정점 쌍 주어짐

import java.io.*;
import java.util.*;
public class 백준_11438_LCA2 {
    static int[][] dp;
    static int[] depth;
    public static void main(String[] args) throws Exception {
        System.setIn("ex01/src/삼성SDS알고리즘/day6/input_11438.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[18][N+1];
        depth = new int[N+1];
        boolean[] vst = new boolean[N+1];
        ArrayList<Integer>[] adj = new ArrayList[N+1];
        for(int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        StringTokenizer tk;
        int a, b;
        for(int i = 1; i < N; i++) {
            tk = new StringTokenizer(br.readLine());
            a = Integer.parseInt(tk.nextToken());
            b = Integer.parseInt(tk.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        vst[1] = true;

        while(!q.isEmpty()) {
            int curr = q.poll();
            for(int i = 0; i < adj[curr].size(); i++) {
                int next = adj[curr].get(i);
                if(vst[next]) {
                    continue;
                }
                dp[0][next] = curr;
                vst[next] = true;
                depth[next] = depth[curr] + 1;
                q.add(next);
            }
        }

        for(int i = 1; i <= 17; i++) {
            for(int j = 1; j <= N; j++) {
                dp[i][j] = dp[i-1][dp[i-1][j]];
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(M-- > 0) {
            tk = new StringTokenizer(br.readLine());
            a = Integer.parseInt(tk.nextToken());
            b = Integer.parseInt(tk.nextToken());
            sb.append(lca(a, b) + "\n");
        }
        System.out.print(sb);
    }

    static int lca(int a, int b) {
        if(depth[a] > depth[b]) {
            int tmp = b;
            b = a;
            a = tmp;
        }
        int gap = depth[b] - depth[a];
        for(int i = 0; i <= 17; i++) {
            if((gap & (1 << i)) > 0) {
                b = dp[i][b];
            }
        }
        if(a == b) {
            return a;
        }
        for(int i = 17; i >= 0; i--) {
            if(dp[i][a] != dp[i][b]) {
                a = dp[i][a];
                b = dp[i][b];
            }
        }
        return dp[0][a];
    }
}