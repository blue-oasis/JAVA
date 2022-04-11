package CodingTest;
import java.util.Scanner;
public class 평균_구하기 {

	public static void main(String[] args) {
		double 최고점 = 0;
		double sum = 0;
		int 과목수 = 0;
		double[] 점수;
		boolean c1 = true;
		
		Scanner in = new Scanner(System.in);
		System.out.println("시험 본 과목의 수를 입력하세요(1000개 이하): ");
		과목수 = in.nextInt();
		
		//0~1000 조건검사
		do {
			c1 = (과목수 <= 0) || (과목수 >= 1000);
			if(c1) {
				System.out.println("0이상 1000이하의 수를 입력해 주세요 ");
				과목수 = in.nextInt();
			}
		}while(c1);
		
		점수 = new double[과목수];
		int count = 0;
		//점수 0~100, 최소 1개는 0 이상
		System.out.println("점수를 띄어쓰기로 구분하여 입력해 주세요 : ");
		for(int i = 0 ; i <점수.length ; i++) {
			double j = in.nextDouble();
			
			if(j >= 0 && j<=100) {
			점수[i] = j;
			}
			else {
				count++;
				i--;
			}
			
			if(count>0) {
			System.out.println("점수 범위(0~100)를 확인후 다시 입력해 주세요: 숫자 " + count + "개를 다시 입력해 주세요" );
			}
		}
		
		
		//(과목총합) * 100 / 최고점 / 과목수
		for(int i = 0; i<점수.length; i++) {
			if(최고점<점수[i]) {
				최고점 = 점수[i];
			}
			sum += 점수[i];
		}
		
		System.out.println(sum * 100 / 최고점 / 과목수);
		
		in.close();
		
	}

}
