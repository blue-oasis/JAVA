package 삼성SDS알고리즘.day7;

//그래프 코드공유
// 최단 경로 말고 K번째 경로 구하기
// 입력 m => 정점 수, n => 간선 수, k= 번째
// m개출에 도로정보 a, b, c // a-b 이동시 c시간 걸림
// 도시 번호는 1~n, 1번이 시작도시
// 출력 n개줄, i번째 줄에 1번에서 i번 가는 k 번째 최단경로 소요시간 출력
// 최단경로 없으면 -1, 최단경로에 같은 정점 중복 상관없음 

import java.io.*;
import java.util.*;

public class 백준_1854_K번째최단경로 {
    static int N, M, K;
    static ArrayList<int[]> adj[];
    static List<Integer> dist[];
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day7/input_1854.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N+1];
        dist = new ArrayList[N+1];
        for(int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<int[]>();
            dist[i] = new ArrayList<Integer>();
        }
        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj[u].add(new int[] {v, w});
        }
        dijkstra();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(dist[i].size() == K ? dist[i].get(K-1) : -1).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void dijkstra() {
        PriorityQueue<Route> pq = new PriorityQueue<Route>();
        pq.offer(new Route(1, 0));
        int doneCnt = 0;
        while(!pq.isEmpty()) {
            Route curr = pq.poll();
            if (dist[curr.v].size() < K) dist[curr.v].add(curr.w);
            else continue;
            if (dist[curr.v].size() == K) doneCnt++;
            if (doneCnt == N) break;
            for(int[] next : adj[curr.v]) {
                int v = next[0];
                int c = next[1];
                int tc = curr.w + c;
                if (dist[v].size() < K) {
                    pq.offer(new Route(v, tc));
                }
            }
        }
    }
    public static class Route implements Comparable<Route>{
        int v, w;
        public Route(int v, int w) {
            super();
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Route o) {
            return this.w - o.w;
        }
    }
}