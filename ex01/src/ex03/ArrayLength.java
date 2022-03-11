package ex03;
import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
		
		for(int i =0; i<intArray.length; i++) {
			intArray[i] = in.nextInt();
			}
			
		for(int i=0; i< intArray.length; i++) {
			sum += intArray[i];
			}
		System.out.print("평균은 " + (double)sum/intArray.length);
		in.close();

	}

}
