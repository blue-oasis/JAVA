package ex0316;

public class lrregularArray {

	public static void main(String[] args) {
		int intArray[][] = new int [4][]; //2차원 비정형 배열, 4행
		intArray[0] = new int[3]; 
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
	
		for(int i = 0; i <intArray.length; i++) { //행의 갯수
			for(int j = 0; j<intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10 + j;
			}
		}
		
		for(int i =0; i<intArray.length; i++) { // i행의 열의 갯수
			for(int j =0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
