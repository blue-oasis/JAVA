package ex03;

public class 삼각형_그리기 {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			
				for(int j = 0; j<5; j++) {
				
					if(i==4||i==j||j==0) {
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
