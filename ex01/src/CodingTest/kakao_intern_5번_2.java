package CodingTest;
/*shiftRow 모든 행이 아래쪽으로 한 칸씩 밀려납니다
 * Rotate 행렬의 바깥쪽에 있는 원소들을 시계 방향으로 한 칸 회전시킵니다.
 */

import java.util.Arrays;

public class kakao_intern_5번_2 {
	
	public static int [][] ShiftRow(int[][] input){
        int [][] answer = new int[input.length][input[0].length];
        for(int i = 0; i<input.length; i++){
            for(int j = 0; j < input[i].length; j++){
                if(i == input.length-1){
                    answer[0][j] = input[i][j];
                }
                else {
                    answer[i + 1][j] = input[i][j];
                }
            }
        }

        return answer;
    }
	
	public static int [][] Rotate(int[][] input){
		// Solve concept
		//   i-th row == reverse of i-th colulm
			
			int size = input.length;
			
			int[][] answer = new int[size][input[0].length];
			
			for(int i = 0 ; i < size ; i++) {
				for (int j = 0; j < size; j++) {
					answer[i][j] = input[size - 1 - j][i];
				}
			}
					
			return answer;
	}

	public static void main(String[] args) {
		int[][] a = {{1 ,2, 3}, {4, 5, 6}, {7, 8, 9}};
		//int[][] b = ShiftRow(a);
		int[][] c = Rotate(a);
		
		//b = ShiftRow(a);
		//System.out.println(a[2][2]);
		//System.out.println(Arrays.deepToString(b)); //2차원 배열 출력은 Arrays.deepToString
		System.out.println(Arrays.deepToString(c));

	}

}
