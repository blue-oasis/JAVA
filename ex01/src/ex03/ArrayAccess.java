package ex03;
import java.util.Scanner;
public class ArrayAccess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] intArray = new int[5]; //배열 생성
		
		int max = 0; //큰 수 저장 변수
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i<5; i++) {
			intArray[i] = in.nextInt();  //입력받아서 배열에 저장하기 
			if(intArray[i]>max) { //max값보다 배열값이 크면
				max = intArray[i]; //큰 수 max에 저장
			}
		}
		System.out.print("가장 큰 수는 " + max + "입니다.");
		
		in.close();
	}

}
