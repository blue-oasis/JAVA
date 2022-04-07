package ex0407;

public class Ex07_BreakControlKeyword {
	 // break 제어문 키워드 실습
	public static void main(String[] args) {
		//#1. 단일 loop break 탈출
		for(int i=0; i<10; i++) {
		System.out.println(i);
		break;
		} //0
		
		for(int i=0; i<10; i++) {
		if(i==5) {
		break;
		}
		System.out.print(i+" ");
		} //0, 1, 2, 3, 4
		System.out.println();
		System.out.println();
		
		//#2. 다중(이중) loop break 탈출
		//@case1. 하나의 반복문만 탈출하는 경우
		for(int i=0; i<5; i++) {
		for(int j=0; j<5; j++) {
		if(j==2) {
		break;
		}
		System.out.println(i+", "+j);
		}
		} //0,0 0,1 1,0, 1,1 ... 4,0 4,1
		System.out.println();
		
		//break label
		POS1: for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j==2) {
				break POS1;
			}
			System.out.println(i + ", " + j);
		}
	}
	System.out.println();
	
	//변수값 조정 탈출
	for(int i= 0; i<5; i++) {
		for(int j = 0; j<5; j++) {
			if(j==2) {
				i=100;
				break;
			}
			System.out.println(i + ", " + j);
		}
	}
	System.out.println();
	}

}
