package 삼성SDS알고리즘.day5;

// 순열 1~N까지의 수 임의 배열한 수열은 N!가지 있음

// 입력 순열 범위 N
// 둘째 줄 첫범째 수 Q = 1이면 Q번째 수열 출력
//  Q= 2 이면 순열 입력받아 몇 번째 순열인지 출력


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1722_순열의순서_소스공유 {

    static int N;
    static int[] nums;
    static long[] fact = new long[21];

    static long[][] dp;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        fact[0] = 1;
        for (int i = 1; i <= 20; ++i) {
            fact[i] = fact[i - 1] * i;
        }

        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int command = Integer.parseInt(st.nextToken());

        if (command == 1) {
            long target = Long.parseLong(st.nextToken());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (visited[j] == true) {
                        continue;
                    }
                    if (target > fact[N - i - 1]) {
                        target -= fact[N - i - 1];
                    } else {
                        sb.append(j);
                        sb.append(" ");
                        visited[j] = true;
                        break;
                    }
                }
            }
            System.out.println(sb.toString());
        } else if (command == 2) {
            nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }
            long result = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 1; j < nums[i]; j++) {
                    if (visited[j] == false) {
                        result += fact[N - i - 1];
                    }
                }
                visited[nums[i]] = true;
            }

            System.out.println(result + 1);
        }
    }
}