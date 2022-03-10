package ex02;
import java.util.Scanner;
public class 좌표_위치_확인 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("점 (x, y)의 좌표를 입력하시오");
		int a = in.nextInt();
		int b = in.nextInt();
		
		if( (200>a) && (200>b) && (a>100) && (b>100)) 
			System.out.println("(" + a + "," + b +")는 사각형 안에 있습니다." );
		else
			System.out.println("(" + a + "," + b +")는 사각형 안에 없습니다." );
		
		in.close();
	}

}
