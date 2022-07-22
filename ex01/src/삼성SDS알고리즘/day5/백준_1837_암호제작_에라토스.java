package 삼성SDS알고리즘.day5;
//소수판별 에라토스테네스의 체
// 암호 = 소수 * 소수
// 암호 조건= 두 수 모두 소수 K보다 클것
// 입력 암호 P, 조건 K
// 출력 조건위배시 BAD랑 작은수 출력
// 아닐 시 GOOD

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class 백준_1837_암호제작_에라토스 {
    static boolean[] isNotPrime; // 함수 아닌거 true
    static char[] P;
    // 소수 찾고 그것의 배수 다 제외 반복 (에라토스테네스의 체)
    // 숫자가 크기 때문에 사칙연산 구현 % 연산 bigInteger
    // 1234567890 / 2 경우 1/2 안대면 1*10+2(다음수) / 2 반복..
    static int K;
    static List<Integer> primes = new ArrayList<>();
    static int MAX = 100000; 

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day5/input_1837.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        P = st.nextToken().toCharArray(); //암호 입력
        K = Integer.parseInt(st.nextToken()); //나누는 수

        isNotPrime = new boolean[MAX + 1];
        for(int i =2; i<MAX +1 ; i++) {
            if(isNotPrime[i] == false) {
                primes.add(i);
                for(int j =  i* 2; j < MAX + 1; j+=i ) {
                    isNotPrime[j] = true;
                }
            }
        }

        for(int prime : primes) {
            if(prime >= K) {
                break;
            }
            if(checkIsBad(prime)) {
                System.out.println("BAD");
                return;
            }
        }
        System.out.println("GOOD");
    }

    static boolean checkIsBad(int x) {
        int ret = 0;
        for(int i = 0; i< P.length ; i++) {
            ret = (ret * 10 +(P[i] - '0')) % x;
        }
        if(ret == 0) {
            return true;
        } else {
            return false;
        }
    }
}
