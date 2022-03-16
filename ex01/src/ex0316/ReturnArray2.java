package ex0316;
import java.util.Scanner;

public class ReturnArray2 {
	static int[] makeArray(int x) { 
		int temp[] = new int[x]; //makeArray 크기 x인 배열 생성 후 
		for(int i=0; i<temp.length; i++) { //0~x-1으로 값 초기화
			temp[i] = i; }
		return temp;
		}
	
	public static void main(String[] args) {
		int intArray[];
		Scanner in = new Scanner(System.in);
		System.out.print("정수값 입력하세요 : ");
		int n = in.nextInt();
		intArray = makeArray(n);
		for(int i: intArray) { //출력
			System.out.print(i + " ");
		}
	}

}


