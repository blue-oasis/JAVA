package 삼성SDS알고리즘.day6;

// 서로소 집합
// 합집합(union)과 검색(fund)연산 구현
// 입력 집합 수 n, 연산개수 m
// 합집합 연산 0 a b/ 검색 연산 1 a b
// 출력 1로 입력하는 연산 대해서 YES / NO로 결과출력

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_1717_집합의표현_소스공유 {
    static int[] parent, depth;

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day6/input_1717.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        depth = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
            depth[i] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (command == 0) {
                union(a, b);
            } else if (command == 1) {
                sb.append((find(a) == find(b) ? "YES" : "NO") + "\n");
            } else {
                continue;
            }
        }
        System.out.println(sb);
        br.close();
    }

    public static int find(int x) {
        return parent[x] = (x == parent[x]) ? x :find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if (depth[x] < depth[y]) {
                int tmp = x;
                x = y;
                y = tmp;
            }
            parent[y] = x;
            if (depth[x] == depth[y]) depth[x]++;
        }
    }
}