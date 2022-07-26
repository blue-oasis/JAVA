package 삼성SDS알고리즘.day7;
// 단절점, DFS 신장 트리
// 그래프가 주어졌을 때, 단절점을 모두 출력
// 입력 정점 V, 간선 E
// E개줄에 간선정보 A B (연결되있음, 양방향)
// 입력은 연결 그래프가 아닐 수 있음, 정점은 1~V까지 번호
// 출력 첫째줄 단절점의 갯수
// 둘째줄 단절점의 번호를 공백으로 구분해 오름차순 출력

import java.io.*;
import java.util.*;
public class 백준_11266_단절점 {
    static int order[];
    static boolean isCut[];
    static int cnt;
    static ArrayList<Integer> adj[];
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day7/input_11266.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        order = new int[N+1];
        isCut = new boolean[N+1];
        adj = new ArrayList[N+1];
        for(int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }
        for(int i = 1; i <= N; i++) {
            if(order[i] == 0) {
                dfs(i, true);
            }
        }
        int ans = 0;
        for(int i = 1; i <= N; i++) {
            ans += isCut[i] ? 1 : 0;
        }
        sb.append(ans + "\n");
        for(int i = 1; i <= N; i++) {
            if(isCut[i]) {
                sb.append(i + " ");
            }
        }
        System.out.println(sb);
    }

    private static int dfs(int cur, boolean isRoot) {
        order[cur] = ++cnt;
        int ret = cnt;
        int child = 0;
        for(int next : adj[cur]) {
            if(order[next] == 0) {
                child++;
                int low = dfs(next, false);
                if(!isRoot && low >= order[cur]) {
                    isCut[cur] = true;
                }
                ret = Math.min(ret, low);
            } else {
                ret = Math.min(ret, order[next]);
            }
        }
        if(isRoot && child > 1) {
            isCut[cur] = true;
        }
        return ret;
    }
}