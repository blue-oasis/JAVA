package ex0330;
import java.util.Scanner;

public class 삽입정렬 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("10 개의 정수를 입력해주세요 : ");
		int[] number = new int[10];
		for(int i = 0; i<10; i++) { //번호 10개 저장
			number[i] = in.nextInt(); 
		}
		System.out.print("입력한 정수 중 위치를 알고자 하는 정수를 입력하세요 : ");
		int where = in.nextInt();
		
		for(int i = 1; i<number.length; i++) { //삽입정렬 알고리즘 (오름차순)
			int 기준수 = number[i]; //두 번째 원소부터 시작하여 비교
			for(int x = 0; x<i; x++) { //처음부터 기준수 위치 전 까지 비교
				int 비교수 = number[x];
				if(비교수>기준수) {
					int swap = 0;
					swap = 기준수;
					기준수 = 비교수;
					비교수 = swap;
					number[i] = 기준수;
					number[x] = 비교수;
				}
			}
		}
		
		for(int k : number) { //정렬된 값 출력
			System.out.print(k + " ");
		}
			System.out.println();
		
		for(int i = 0; i<number.length; i++) { //배열 안 where값의 위치 출력
			if(number[i] == where) { 
				System.out.println(i+1);
			}
		}
		in.close();
	}

}
