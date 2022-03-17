package ex0317;

public class 배열_출력_2차원비정형 {

	public static void main(String[] args) {
		int[][] n = {{1}, {1,2,3},{1},{1,2,3,4},{1,2}};
	
				
			for(int i =0; i<n.length; i++) { // i행의 열의 갯수
				for(int j =0; j<n[i].length; j++) { //j 열 숫자
					System.out.print(n[i][j]+" ");
				}
				System.out.println(); //한 행 끝나면 개행
			}
		}
	}

