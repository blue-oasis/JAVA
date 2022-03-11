package ex03;

public class 별_피라미드 {

	public static void main(String[] args) {
		
		
		
			for(int i = 0; i<5; i++) {
			
			for(int j = 0; j<(5*2)-1; j++) {
			
				if(i==4||i+j == 4|| j-i==4) { //i4행, j4열 그리고 (1,3)(2,2)(3,1)찍기
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
