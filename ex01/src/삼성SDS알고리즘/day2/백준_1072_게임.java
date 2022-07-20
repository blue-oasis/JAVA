package 삼성SDS알고리즘.day2;
// 입력 게임 횟수 X, 이긴 게임 Y //입력아님 승률 Z
// 앞으로 모든 게임에서 이김
// 승률 변하라면 최소 몇번더 게임하는가? 구하기
// 출력 최소게임수

import java.io.FileInputStream;
import java.util.Scanner;

public class 백준_1072_게임 {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day2/input_1072.txt"));
        Scanner in = new Scanner(System.in);
    
        long X = in.nextLong(); // 게임횟수
        long Y = in.nextLong(); // 이긴 게임수

        long z = 100 * Y/X; //승률

        if (z >= 99) {
            System.out.println(-1);
        } else {
            long start = 0;
            long end = X;
            while (start < end) {
                long mid = (start + end) / 2; //최대게임수 /2해서 계산
                long newRate = (100 * (Y + mid) / (X + mid));
                //승률이 그대로인 경우 게임 더하기, mid 버림
                if(newRate == z) {
                    start = mid + 1;
                }
                //승률이 변한 경우 최소값인지 알아야함, mid는 답 후보
                else {
                    end = mid;
                }
                //정답 1개 나올때까지 돌아감
            }
            System.out.println(end); //답 출력
            in.close();
        }

        
    }
   
}
