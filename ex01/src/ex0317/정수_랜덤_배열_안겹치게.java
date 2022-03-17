package ex0317;

import java.util.Scanner;

public class 정수_랜덤_배열_안겹치게 {
	static int[] makeArray(int x) { 
		int temp[] = new int[x]; //makeArray 함수 크기 x인 배열 생성 후 
		for(int i=0; i<temp.length; i++) { //0으로 값 초기화
			temp[i] = (int)(Math.random()*100+1); }
		return temp;
		}
	
	public static void main(String[] args) {
		int intArray[];
		Scanner in = new Scanner(System.in);
		System.out.print("정수값을 입력하세요 : ");
		int n = in.nextInt();
		intArray = makeArray(n);
		
		for(int i: intArray) { //출력
			System.out.print(i + " ");
		}
		in.close();
	}

}
