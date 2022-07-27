package 삼성SDS알고리즘.day8;
// 서로소 집합(Disjoint Set, Union-find)
// 두 샘플 무게 잰 자료 입력, 두 샘플 무게 차이 구할수 있는지 알아보기
// 입력 여러개 테스트케이스 첫째 줄 샘플 종류/갯수 N, 한 일 수 M
// 샘플은 1~N번 번호매김
// M줄만큼 입력 무게잰거 ! a b w => b가 a보다 w그램 무거움
// 질문 ? a b => b가 a보다 얼마나 무거운지 출력
// 마지막줄 00
// 출력 질문 들어올 때마다 무게차이 계산 가능하면 얼마나 무거운지 출력
// 계산 불가 UNKNOWN 출력


import java.io.*;
import java.util.*;

public class 백준_3830_교수님은기다리지않는다 {
    static int N, M;
    static int[] par;
    static long[] wei;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day8/input_3830.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if( N ==0 && M==0) break;
            par = new int[N+1];
            wei = new long[N+1];
            for (int i = 1; i <= N; i++) {
                par[i]= i;
            } 
            int a, b, w;
            char cmd;
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                cmd = st.nextToken().charAt(0);
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                if(cmd == '!') {
                    w = Integer.parseInt(st.nextToken());
                    union(a, b, w);
                }
                else {
                    if(find(a) != find(b)) {
                        sb.append("UNKNOWN\n");
                    } else {
                        long diff =  wei[a] - wei[b];
                        sb.append(diff + "\n");
                    }
                }       
            }
        }
        System.out.println(sb);
    }

    public static int find(int n) {
        if (par[n]==n) {
            return n;
        }
        int p = find(par[n]);
        wei[n] += wei[par[n]];
        par[n] = p;
        return p;
    }

    static void union(int a, int b, int w) {
        int pa = find(a);
        int pb = find(b);
        if (pa == pb) return;
        wei[pa] = wei[b] - wei[a] + w;
        par[pa] = pb;
    }
}
