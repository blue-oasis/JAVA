package ex0411;
import java.util.Arrays;

public class Ex05_ArrayArgumentMetho {
	// 배열 입력 매개변수가 있는 메서드 호출 실습
	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3};
		printArray(a);
		printArray(new int[] {1, 2, 3});
		// printArray({1, 2, 3});    // 오류발생
	}

	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
