package 삼성SDS알고리즘.day4;
// 인덱스 트리
// N번째로 맛있는 맛 꺼내기
// 입력 사탕 꺼내는 횟수 N
// N개줄에 A, B, C
// A=1이면 사탕 꺼냄, B 꺼낼 사탕의 순위
// A=2면 사탕 넣음, B 넣을 사탕의 맛, C 사탕 갯수 (양수 +, 음수 빼기)
// 출력 꺼낸 사탕의 맛 번호
// 사탕 상자는 빈 채로 출발, 없는 사탕 꺼내는 경우는 없음

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_2243_사탕상자_소스공유  {

    static int N, M;
    static int A, B, C;
    static int MAX = 1000000;
    static int[] tree;
    static int S;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day4/input_2243.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = 1;
        while (S < MAX) {
            S *= 2;
        }
        tree = new int[2 * S];
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            if (A == 2) {
                B = Integer.parseInt(st.nextToken());
                C = Integer.parseInt(st.nextToken());
                update(1, S, 1, B, C);
            } else if (A == 1) {
                B = Integer.parseInt(st.nextToken());
                int index = query(1, S, 1, B);
                update(1, S, 1, index, -1);
                System.out.println(index);
            }
        }
    }

    static int query(int left, int right, int node, int count) {
        // 1. Leaf 에 도착했을때 -> 사탕 번호 반환
        if (left == right) {
            return left;
        } else {
            int mid = (left + right) / 2;
            // 2. 왼쪽 >= count -> 왼쪽으로 이동
            if (tree[node * 2] >= count) {
                return query(left, mid, node * 2, count);
            }
            // 3. 왼쪽 < count -> 오른쪽으로 이동
            else {
                count -= tree[node * 2];
                return query(mid + 1, right, node * 2 + 1, count);
            }
        }
    }

    static void update(int left, int right, int node, int index, long diff) {
        if (left <= index && index <= right) {
            tree[node] += diff;
            if (left != right) {
                int mid = (left + right) / 2;
                update(left, mid, node * 2, index, diff);
                update(mid + 1, right, node * 2 + 1, index, diff);
            }
        }
    }
}