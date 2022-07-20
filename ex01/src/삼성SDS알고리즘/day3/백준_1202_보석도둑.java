package 삼성SDS알고리즘.day3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
// 보석도둑 최대힙
//작은가방에 먼저 답아야 유리함
// 훔칠 수 있는 보석 가격 최댓값 출력
// 입력 보석개수 N, 가방개수  K
// N개줄 보석 무게 M, 가격 V
// K개줄 가방 최대 무게 C
// 출력 훔친 보석 가격 최대값
public class 백준_1202_보석도둑 {
    // 가방 오름차순, 보석 무게 오름차순
    static int N, K, M, V, C;
    static int[] bags;
    static Jew[] jew;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day3/input_1202.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        jew = new Jew[N];
        bags = new int[K];

        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            jew[i] = new Jew(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for(int i = 0 ; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        //가방 오름차순 정렬
        Arrays.sort(bags);
        //보석 무게 오름차순 정렬
        Arrays.sort(jew, Comparator.comparingInt(Jew::getWeight));
        //보석 가격이 높은값 기준 힙 (내림차순)
        PriorityQueue<Jew> pq = new PriorityQueue<>(Comparator.comparingInt(Jew::getValue).reversed());

        int jIndex = 0; //보석 인덱스
        long result = 0; //보석가격 합산

        //1. 남은 가방 중 제일 작은 가방을 선택 <- 정렬
        for(int i = 0; i < bags.length; i++) {
            while(jIndex < N && jew[jIndex].weight <= bags[i]){
                // 인덱스 범위 안, 가방보다 가볍거나 같음 조건
                //2. 선택한 가방에 넣을 수 있는 남은 보석 중 가장 비싼  보석을 선택 <- 힙을 사용
                pq.add(jew[jIndex++]);
            }
            if(!pq.isEmpty()) {
                result += pq.poll().value;
            }
        }
        System.out.println(result);

    }
}

class Jew { //보석 클래스
    int weight;
    int value;

    public Jew (int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }


    public int getValue() {
        return value;
    }

}
