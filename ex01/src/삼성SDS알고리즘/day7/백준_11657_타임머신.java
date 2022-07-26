package 삼성SDS알고리즘.day7;

//그래프 코드공유
// 단일출발 최단경로
// 밸만포드 ? 음수 가중치 있음
// 1번 도시에서 출발해 나머지 도시로 가는 가장 빠른 시간 구하기
// 입력 도시 개수 N, 버스 노선 개수 M
// 버스 노선 정보 A, B, C 
// A = 시작 도시, B = 도착 도시, C = 버스 이동 시간
// C = 0 순간이동 / C < 0 시간 되돌아감
//출력 도시이동중 무한히 시간 되돌릴 수 있으면 -1
// 아니면 N-1개줄에 1, 2, 3..N번 도시로 가는 최단경로 출력
// 경로 없으면 -1 출력

import java.io.*;
import java.util.*;

public class 백준_11657_타임머신 {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day7/input_11657.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());

        long[] D = new long[N+1];
        int[][] edgeList = new int[M][3];
        long INF = Long.MAX_VALUE;
        for(int i = 0; i < M; i++) {
            tk = new StringTokenizer(br.readLine());
            edgeList[i][0] = Integer.parseInt(tk.nextToken());
            edgeList[i][1] = Integer.parseInt(tk.nextToken());
            edgeList[i][2] = Integer.parseInt(tk.nextToken());
        }
        Arrays.fill(D, INF);
        D[1] = 0;
        int a, b, w;
        boolean flag = false;
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < M; j++) {
                a = edgeList[j][0];
                b = edgeList[j][1]; 
                w = edgeList[j][2];
                if(D[a] == INF) continue;
                if(D[b] > D[a] + w) {
                    if(i == N) flag = true;
                    D[b] = D[a] + w;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        if(flag) sb.append(-1);
        else {
            for(int i = 2; i <= N; i++) {
                sb.append((D[i] == INF ? -1 : D[i]) + "\n");
            }
        }
        System.out.print(sb);

    }
}
