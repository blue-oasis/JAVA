package 삼성SDS알고리즘.day7;
//다익스트라 코드공유
// 방향그래프가 주어지면 주어진 시작점에서 다른 모든 정점까지 최단경로 구하기
// 입력 정점개수 V, 간선개수 E / 정점은 1~V
// 시작 정점의 번호 K
// 셋째줄부터 E개줄 간선 u, v, w => u에서 v로 가는 가중치 w 간선 존재
// w는 10이하. u != v
// 다른 정점 사이에 여러개의 간선이 존재할 수 있음

import java.io.*;
import java.util.*;
public class 백준_1753_최단경로 {
    static int N, M, K;
    static ArrayList<int[]> adj[];
    static int dist[];
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day7/input_1753.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N+1];
        dist = new int[N+1];
        for(int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<int[]>();
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
            sb.append(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void dijkstra() {
        PriorityQueue<Route> pq = new PriorityQueue<Route>();
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K] = 0;
        pq.offer(new Route(K, 0));
        while(!pq.isEmpty()) {
            Route curr = pq.poll();
            if(dist[curr.v] < curr.w) continue;
            for(int[] next : adj[curr.v]) {
                if (dist[next[0]] > curr.w + next[1]) {
                    dist[next[0]] = curr.w + next[1];
                    pq.offer(new Route(next[0], dist[next[0]]));
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
