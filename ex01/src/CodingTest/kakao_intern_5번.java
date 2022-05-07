package CodingTest;
/*shiftRow 모든 행이 아래쪽으로 한 칸씩 밀려납니다
 * Rotate 행렬의 바깥쪽에 있는 원소들을 시계 방향으로 한 칸 회전시킵니다.
 */

import java.util.Arrays;

public class kakao_intern_5번 {
	
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
		int [][] answer = new int[input.length][input[0].length];
		int [] temp = new int[input[0].length + (input.length - 2)]; 
		int count = 0;
		int num = input[0].length;
		
		temp[0] = input[2][0]; //첫숫자 저장
		for(int i = 0; i < num; i++) { //1행 저장
			temp[1 + i] = input[0][i];
			count++;
		}
		
		for(int i = 1; i < num - 1; i++) { //2번~마지막행 전까지 끝번호 저장
			temp[count] = input[i][input[i].length];
			count++;
		}
		
		for(int i = num; i>=0; i--) { //마지막행 역순으로 저장
			temp[count] = input[input[0].length][i];
			count++;
		}
		
		for(int i = num-1; i>0; i--) {
			temp[count] = input[i][0];
			count++;
		}
		//다시 어떻게 갖다붙이냐....
		 System.out.println(Arrays.toString(temp));
		
		
		return answer;
	}

	public static void main(String[] args) {
		int[][] a = {{1 ,2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] b = ShiftRow(a);
		//b = ShiftRow(a);
		System.out.println(a[2][2]);
		System.out.println(Arrays.deepToString(b)); //2차원 배열 출력은 Arrays.deepToString
		Rotate(a);
	}

}
