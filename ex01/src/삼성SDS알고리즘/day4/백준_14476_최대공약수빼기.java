package 삼성SDS알고리즘.day4;
// 누적 gcd 구하기(최대공약수) ,a~af / af ~ f
// 유클리드 호제법 사용 a%b = r, while(b % r = 0) -> b = gcd(a,b)
// 입력 숫자개수 N
// 숫자 배열
// 숫자중 하나 빼서 가장 큰 최대공약수 구하기
// 출력 최대공약수, 뺀 수

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_14476_최대공약수빼기 {
    static int N, gcd, delNum;
    static int[] lowGcd, highGcd, nums;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day4/input_11476.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); //숫자 갯수 입력

        lowGcd = new int[N];
        highGcd = new int [N];
        nums = new int[N];
        
        //숫자 배열 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i <N ; i ++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // L to R 만들기
        for(int i = 1 ; i < N; i++){
            lowGcd[i] = getGcd(lowGcd[i-1], nums[i]);
        }
        // R to L 만들기
        highGcd[N - 1] = nums[N -1 ];
        for(int i = N - 2 ; i >= 0; i--){
            highGcd[i] = getGcd(highGcd[i+1], nums[i]);
        }
        
        //K 선정하기
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < N; i++) {
            int gcd = 0;
            //0
            if(i == 0) {
                gcd = highGcd[1];
            }
            // N - 1
            else if(i == N - 1) {
                gcd = lowGcd[N -2];
            }
            // 중간
            else {
                gcd = getGcd(lowGcd[i - 1], highGcd[i + 1]);
            }

            if(nums[i] % gcd != 0 && gcd > max) {
                max = gcd;
                maxIndex = i;
            }
        }
//-------------------------------------------------------------------------------------------------내꺼
        //첫 인덱스 세팅
        int x = nums[0];
        int y = nums[1];
        lowGcd[0] = getGcd(x, y);

        for(int i = 1 ; i < N ; i++) {
            y = nums[i + 1];
            // 유클리드 호제법 사용 누적 배열 구하기
            lowGcd[i] = getGcd(lowGcd[i - 1], y);
        }
        

    }



// gcd(x, y) == gcd(b, r) == gcd(y, x % y), stop when x % y == 0;
static int getGcd(int x, int y) {
    //유클리드 호제법
    //크기 조절 계산하면 자동으로 바껴서 필요없음
    while(y != 0) {
        int r = x % y;
        x = y;
        y = r;
    }

    return x;
    
    //int r = x % y;

/*  while(r != 0) { 내꺼
        // 나머지 0 나올때까지 y % r 굴리기 
        int a = r; //값 보존용
        r = y % r;
        y = a;
    }

    return y; */
    }
}
