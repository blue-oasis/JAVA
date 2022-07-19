package 삼성SDS알고리즘.day2;
// 입력 나무 갯수 N, 목표값 M
// 나무 길이 배열
// 출력 나무 자른게 목표값과 같거나 큰거중에 가장 큰 톱 높이

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 백준_2805_나무자르기 {
    static int N, M;
	static int[] trees;

    public static void main(String[] args) throws Exception  {
        
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day2/input3.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 수열 갯수
		M = Integer.parseInt(st.nextToken()); //목표값

		trees = new int[N + 1]; // out index 방지 곱일때는 마지막 원소 1로 만들어야함
        int max = 0;
        
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(trees[i], max);
		}

      long s = 0; //시작
      long e = max; //끝
      long mid;
      long result = 0;

      while(true) {
        mid = (s + e) / 2;
        long sum = calc(mid);
        // sum == M 정답, 탈출
        if(sum == M) {
            result = mid;
            break;
        }
        // sum < M -> mid -> end
        else if(sum < M) {
            e = mid - 1 ;
        }
        //sum > M -> mid -> s, 정답후보
        else {
            result = mid;
            s = mid + 1; //이미 기록했으면 mid 버림
        }

        if(s > e) { //탈출 조건과 계산 논리 구분하는게 좋음
            break;
        }

      }

      System.out.println(result);

    }

    static long calc(long value) { //나무 자른거 합 계산
        long result = 0;
        for(int i = 0; i < trees.length ; i++) {
            int tree = trees[i];
            if(tree > value ) {
                result += tree - value;
            }
        }
        return result;
    }
}
