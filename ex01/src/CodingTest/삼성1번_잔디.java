package CodingTest;
import java.util.Scanner;
import java.util.Arrays;

public class 삼성1번_잔디 {

	public static void main(String[] args) {
		int t = 0;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		//테스트 케이스만큼 돌리기
		for(int i = 0; i < t; i++) {
			int sero = in.nextInt(); //가로
			int garo = in.nextInt(); //세로
			int day = in.nextInt(); //일수
			int jandi = sero * garo; //잔디 칸수
			int[] oil = new int[day]; //기름 배열
			int[] madang = new int[jandi]; //계산용 배열
			
			long answer = 0;
			
			//잔디 길이 받기
			for(int j = 0; j < jandi; j++) {
				madang[j] = in.nextInt();
			}
			
			//기름 받기
			for(int k = 0; k < day; k++) {
				oil[k] = in.nextInt();
			}
			
			for(int j = 0; j<day; j++) {
				 for(int a = 0; a < day; a++) {
                     madang[a] = madang[a] + 1; //매일 1cm 자람
                 }
				Arrays.sort(madang); //오름차순 정렬
				for(int o = 1; o <= oil[j]; o++) { //기름양만큼 돌림
					int temp = madang[jandi - o];
					madang[jandi - o] = 1; //깎음
					answer += o * (temp - 1); //일수 * 깎은 잔디 더하기 
				}
			}
			
			System.out.println("#" + (i+1) + " " + answer);
		}
		
	}

}
