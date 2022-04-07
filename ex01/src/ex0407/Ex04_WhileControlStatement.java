package ex0407;

public class Ex04_WhileControlStatement {
	 // while 반복제어문의 기본문법구조, for로 변환, 특수한 형태, 무한루프 탈출 실습
	public static void main(String[] args) {
		int a = 0;
		while(a<10) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		
		//for문 변환
		for(int i = 0; i<10; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		int b = 10;
		while(b>0) {
			System.out.println(b + " ");
			b--;
		}
		System.out.println();
		
		for(int i = 10; i>0; i--) {
			System.out.println(i + " ");
		}
		
		/*특수형태 - 무한루프
		 * while(true){
		 * System.out.println("무한루프);
		 * }
		 */
		
		System.out.println();
		//무한루프 탈출
		int c = 0;
		while(true) {
			if(c>10) {
				break;
			}
			System.out.println(c + " ");
			c++;
		}
	}

}
