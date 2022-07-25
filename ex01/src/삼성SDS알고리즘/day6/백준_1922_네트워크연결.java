package 삼성SDS알고리즘.day6;
// 최소비용 신장트리(MST)
// 컴퓨터를 최소비용 네크워크로 연결
// 입력 컴퓨터의 수 N
// 연결 할 수 있는 선의 수 M
// 셋째 줄 부터 M+2까지 연결비용 a b c
// a b 컴퓨터 번호/ c 비용
// 출력 모든 컴퓨터 연결하는 최소비용값

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1922_네트워크연결 {
    static int[] parent;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day6/input_1922.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N+1];
        for(int i = 1 ; i <= N; i++) {
            parent[i] = i;
        }

        int a, b, c;
        for(int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            pq.add(new int[]{a, b, c});
        }
        int cnt = 0, total = 0;
        while(cnt < N-1 && !pq.isEmpty()) {
            int[] tmp = pq.poll;
        }


    }
}
