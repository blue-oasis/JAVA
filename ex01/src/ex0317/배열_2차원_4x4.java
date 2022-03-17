package ex0317;

public class 배열_2차원_4x4 {

	public static void main(String[] args) {
		int [][] A = new int[4][4];
		
	for(int z = 0; z<10; z++) {
		for(int i = 0; i<A.length; i++) {
			for(int j = 0; j<A[i].length; j++) {
				A[i][j] = (int)(Math.random()*10+1);
			}
				
			}
		
		for(int i = 0; i<A.length; i++) { //순서대로 출력
			for(int j = 0; j<A[i].length; j++) {
		  System.out.print(A[i][j]);
		
			}

}
	}
	}
}
