package ex0411;
//메서드의 가변길이 배열 입력 매개변수
import java.util.Arrays;
public class Ex09_FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// method1(int...valuse)
		method1(1, 2);
		method1(1, 2, 3);
		method1();
		
		//method2(String...value)
		method2("안녕", "방가");
		method2("땡큐", "베리", "감사");
		method2();
		
		

	}
	

public static void method1(int...values) {
	System.out.println("배열의 길이: " + values.length);
	
	for(int k : values) {
		System.out.println(k + " ");
	};
	
	/*배열 출력 방법2
	 * System.out.println(Arrays.toString(values));
	 */
	
	}

public static void method2(String...values) {
	System.out.println("배열의 길이 : " + values.length );
	
	for(String k : values) {
		System.out.println(k + " ");
	};
}
}
