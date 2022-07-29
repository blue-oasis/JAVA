package 삼성SDS알고리즘.day9;

// 코드공유 이분탐색, LIS(최장증가수열) 구하기
// 수열 A = {10, 20, 10, 30, 20, 50} 인 경우
// 가장 긴 증가하는 부분 수열은 A = {10, 20, 30, 50} 이고, 길이는 4
// 입력 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)
// 둘째 줄에는 수열 A를 이루고 있는 Ai
// 출력 첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이
// 둘째 줄에는 정답이 될 수 있는 가장 긴 증가하는 부분 수열

import java.io.*;
import java.util.*;
public class 백준_14003_가장긴증가하는부분수열 {
    static int N;
    static int[] LIS;
    public static int binarySearch(int left, int right, int x) {
        int mid;
        while(left < right) {
            mid = (left + right) / 2;
            if(x > LIS[mid]) left = mid + 1;
            else right = mid;
        }
        return right;
    }
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("ex01/src/삼성SDS알고리즘/day9/input_14003.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer token = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(token.nextToken());
        }
        LIS = new int[N+1];
        LIS[0] = -1000000001;
        int length = 0;
        ArrayList<Integer> result = new ArrayList<>();
        int[] LISIndex = new int[N+1];
        for(int i = 1; i <= N; i++) {
            //LIS배열의 가장 마지막 원소보다 Ai가 크다면 LIS의 마지막 공간에 삽입
            if(LIS[length] < A[i-1]) {
                LIS[++length] = A[i - 1];
                LISIndex[i] = length;
            }
            //그렇지 않으면 이분탐색해서 LIS 중간에 삽입
            else {
                int index = binarySearch(1, length, A[i-1]);
                LIS[index] = A[i-1];
                LISIndex[i] = index;
            }
        }
        for(int i = N; i > 0 && length > 0; i--) {
            if(length == LISIndex[i]) {
                result.add(A[i-1]);
                length--;
            }
        }
        bw.write(result.size()+"\n");
        for(int i = result.size()-1; i >= 0; i--) {
            bw.write(result.get(i) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}