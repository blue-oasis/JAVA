package 삼성SDS알고리즘.day6;
//위상정렬로 풀기
// 학생들 키 순대로 줄세우기, 근데 일부 학생만 재서 둘씩 비교함
// 입력 N 학생 번호갯수, M 키를 비교한 횟수
// M개 줄에 키 비교한 학생 번호 A B/ 키는 A < B
// 출력 줄세운 결과 여러가지면 아무거나
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 백준_2252_줄세우기 {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day6/input_2252.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] in = new int[N + 1];
        ArrayList<Integer>[] adj = new ArrayList[N+1];
        for(int i = 0; i < N+1 ; i++) {
            adj[i] = new ArrayList();
        }

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to= Integer.parseInt(st.nextToken());
            adj[from].add(to);
            in[to]++;
        }
        Queue<Integer> q = new LinkedList();
        for(int i = 1; i< N+1; i++) {
            if(in[i] == 0) {
                q.add(i);
            }
        }
        while(!q.isEmpty()) {
            int now = q.poll();
            sb.append(now).append(" ");
            for(int next: adj[now]) {
                in[next]--;
                if(in[next] == 0) {
                    q.add(next);
                }
            }
        }
        System.out.println(sb);
    }
        
}
