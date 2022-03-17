package ex0317;

public class 배열_2차원_4x4 {

	public static void main(String[] args) {
		int [][] A = new int[4][4];
		
	for(int z = 0; z<10; z++) { //랜덤으로 값 10회 넣어주기
		int 행 = (int)(Math.random()*4) ; //행, 열 인덱스 랜덤 (0~3)
		int 열 = (int)(Math.random()*4) ; 
			if(A[행][열]==0) { //접근값이 비어있으면 1~10 랜덤할당
			A[행][열] = (int)(Math.random()*10+1);
		}
			else if(A[행][열]!=0) { //이미 값이 있으면 z값-1해서 반복 다시
				z--;
			}
			
	}		
			
		
		for(int i = 0; i<A.length; i++) { //배열 순서대로 출력
			for(int j = 0; j<A[i].length; j++) {
		  System.out.print(A[i][j] + "\t");
			}
			System.out.println(); //행마다 줄바꿈
		}
	}
}

