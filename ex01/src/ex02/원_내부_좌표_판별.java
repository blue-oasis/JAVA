package ex02;
import java.util.Scanner;
public class 원_내부_좌표_판별 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원의 중심과 반지름을 입력하시오.:");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		System.out.print("점을 입력하시오.:");
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		double D = a + c;
		double E = a - c;
		double F = b + c;
		double G = b - c;
		
		if (D>x && E<x && F>y && G<y)
			System.out.println("점(" + x + ", " + y + ")는 원 안에 있습니다.");
		else 
			System.out.println("점(" + x + ", " + y + ")는 원 안에 없습니다.");
			
		
		/*if ( ((a+=c)> x) && ((a-=c)> x) && ((b+=c)> y) && ((b-=c)> y) )
		System.out.println("점(" + x + ", " + y + ")는 원 안에 있습니다.");
		else 
		System.out.println("점(" + x + ", " + y + "는 원 안에 없습니다."); 
		지저분해서 일단 뺌 */
						
	}

}
