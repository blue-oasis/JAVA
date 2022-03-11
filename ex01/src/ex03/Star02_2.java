package ex03;

public class Star02_2 {

	public static void main(String[] args) {
		//속 빈 사각형2 00 11 22 33 4
		for(int i = 0; i<5; i++) {
			/*if(i ==0 ) {
			System.out.println("**********");*/
			
				for(int j = 0; j<5; j++) {
				
					if(i ==0 || i ==4 || j==0 || j==4) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
			}
			System.out.println();
		}//System.out.println("**********");

	}

}
