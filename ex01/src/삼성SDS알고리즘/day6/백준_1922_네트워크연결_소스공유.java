package 삼성SDS알고리즘.day6;
// 최소비용 신장트리(MST)
// 컴퓨터를 최소비용 네크워크로 연결
// 입력 컴퓨터의 수 N
// 연결 할 수 있는 선의 수 M
// 셋째 줄 부터 M+2까지 연결비용 a b c
// a b 컴퓨터 번호/ c 비용
// 출력 모든 컴퓨터 연결하는 최소비용값
import java.util.*;
import java.io.*;
public class 백준_1922_네트워크연결_소스공유 {
    static int N;
    static int M;
    static int[] parent;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        parent = new int[N+1];
        for(int i = 1; i <= N; i++){
            parent[i] = i;
        }
        int a, b, c;
        for(int i = 0 ; i < M; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            pq.add(new int[]{a,b,c});
        }
        int cnt = 0, total = 0;
        while(cnt < N-1 && !pq.isEmpty()){
            int[] tmp = pq.poll();
            if(find(tmp[0]) != find(tmp[1])){
                cnt++;
                union(tmp[0], tmp[1]);
                total += tmp[2];
            }
        }
        System.out.println(total);
    }
    static int find(int x){
        return parent[x] = (parent[x] == x) ? x : find(parent[x]);
    }
    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        parent[a] = b;
    }
}