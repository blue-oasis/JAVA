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
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class 백준_2243_사탕상자 {
    static int N, A, B, C, S;
    static int[] tree;
    
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day4/input_2243.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //질의 수

        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            if(A == 1) {
                // 사탕 꺼내기
                B = Integer.parseInt(st.nextToken()); //사탕 순위
                //쿼리 (L, R, Node, QC쿼리카운트)
                int index = query(1, S, 1, B);
                update(); // 이건 함수 그대로 변수만 넣어서 써먹기
                System.out.println(index);
            }
            else{
                //사탕 넣기 update
                B = Integer.parseInt(st.nextToken()); //넣을 맛 번호
                C = Integer.parseInt(st.nextToken()); //갯수
            }
        }
       
    }



// Top-Down-------------------------------------쿼리, update
static int query(int left, int right, int node, int count) {
    // 1. Leaf에 도착했을때 ->사탕 번호 반환
    if(left == right) {
        return left;
    }
    else{
        int mid = (left + right) /2;
        // 2. 왼쪽 >= count -> 왼쪽으로 이동
        if(tree[node *2] >= count){
            return query(left, mid, node * 2, count);
        }
        // 3. 왼쪽 < count -> 오른쪽으로 이동
        else {
            return query(mid + 1, right, node * 2 + 1, count);
        }
    }
}

static void update(int left, int right, int node, int target, long diff) {
    // 연관없음
    if(target < left || right < target) {
        return;
    }
    // 연관있음 -> 현재 노드에 diff 반영 -> 자식에게 diff 전달
    else {
        tree[node] += diff;
        if(left != right) {
            //내부노드 여부 판별
            int mid = (left + right) / 2;
            update(left, mid, node * 2 + 1, target, diff);
            update(mid + 1, right, node * 2 + 1, target, diff);
        }
    }
}
}



