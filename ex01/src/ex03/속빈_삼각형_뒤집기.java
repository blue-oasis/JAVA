package ex03;

public class 속빈_삼각형_뒤집기 {

	public static void main(String[] args) {
		
		// 삼각형 좌우반전
		for(int i = 0; i<5; i++) {
			
			for(int j = 0; j<5; j++) {
			
				if(i==4||i+j == 4||j==4) { //i4행, j4열 그리고 (1,3)(2,2)(3,1)찍기
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
		}
		System.out.println();
	}

	}

}
