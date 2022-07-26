package 삼성SDS알고리즘.day7;
// 그래프이론, 플로이드워셜 소스공유
//  두 학생끼리 키를 비교한 결과 주어짐, 학생들 키는 모두 다름
// 자신의 키가 몇 번째인지 알 수 있는 학생의 수 출력
// 입력 학생수 N, 키 비교수 M
// 키 비교 결과 a, b => 키 a<b

import java.io.*;
import java.util.*;

public class 백준_2458_키순서 {
    static int N, M, inCnt[], outCnt[];
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Integer> adj[];
    static boolean visited[];

    static int dfs(int curr) {
        int outCnt = 0;
        for (int next : adj[curr]) {
            if (visited[next]) {
                continue;
            }
            inCnt[next]++;
            visited[next] = true;
            outCnt += dfs(next);
        }
        return outCnt + 1;
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day7/input_2458.txt"));
        st = new StringTokenizer(in.readLine());
        N = Integer.valueOf(st.nextToken());
        M = Integer.valueOf(st.nextToken());
        adj = new ArrayList[N + 1];

        inCnt = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
        }
        outCnt = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            outCnt[i] = dfs(i) - 1;
        }
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if ((inCnt[i] + outCnt[i]) == N - 1) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}