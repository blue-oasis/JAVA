package 삼성SDS알고리즘.day8;
// 단절점 문제
// 단절 시 비용 합 구하기 (단절 되면 각 노드 수 * 노드 수) 안되면 0
// 입력 통신탑 갯수 N, 연결개수 M, 연결 분할 횟수 Q
// 두 번째 줄부터 M개줄 X Y => XY 사이에 연결있음
// 중복된 연결 없음, 모든 탑은 초기에 하나의 통신망, 재귀연결 없음
// Q개 줄 제거될 연결 번호 A => A번째 입력된 XY 줄 제거
// 연결 제거 비용 출력

import java.io.*;
import java.util.*;

public class 백준_17398_통신망분할 {
    static int N, M, Q, X, Y;
    static long sum;
    static int arrQ[];
    static boolean chk[]; // 처음 넣을 간선인지 아닌지 체크
    static long cnt[];
    static int par[];
    static Edge edges[];

    static int find(int n) {
        if (par[n] == n)    return n;
        return par[n] = find(par[n]);
    }

    static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);
        if (findA == findB)
            return;
        sum += (1L * cnt[findA] * cnt[findB]);
        cnt[findB] += cnt[findA];
        par[findA] = findB;
    }
    static class Edge {
        int a, b;
        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day8/input_17398.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        edges = new Edge[M + 1];
        sum = 0;
        arrQ = new int[Q + 1];
        chk = new boolean[M + 1];
        cnt = new long[N + 1];
        par = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            par[i] = i;
            cnt[i] = 1; // 처음 1로초기화
        }

        for (int m = 1; m <= M; m++) {
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            edges[m] = new Edge(X, Y);
        }

        Arrays.fill(chk, true);
        for (int i = 1; i <= Q; i++) { // Q입력
            st = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken()); // arrQ에 1번부터 Q의 정보 입력
            arrQ[i] = q;
            chk[q] = false; //제거 처리
        }

        for (int i = 1; i <= M; i++) {
            if (chk[i] == true) { //마지막까지 제거되지 않은 간선이면 초기 union
                int A = edges[i].a;
                int B = edges[i].b;     
                union(A, B);
            }
        }
        long temp = sum;

        // Q를 마지막부터 꺼내면서 union하고 계산
        for (int i = Q; i >= 1; i--) {
            int N = arrQ[i];
            int A = edges[N].a;
            int B = edges[N].b;
            union(A, B);
        }
        System.out.println(sum - temp);
    }
}