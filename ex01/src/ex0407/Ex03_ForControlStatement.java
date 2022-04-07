package ex0407;

public class Ex03_ForControlStatement {

	public static void main(String[] args) {
		int a;
		for(a=0; a<3; a++) {
			System.out.println(a + " ");
		}
		System.out.println();
		
		for(int i = 0; i<100; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		for(int i = 10; i>0; i--) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i<10; i+=2) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		for(int i = 0, j = 0; i<10; i++, j++) {
			System.out.println(i + j + " ");
		}
		System.out.println();
		
		//특수형태 - 무한루프
		/*
		 * for(int i = 0; ; i++){
		 * Systme.out.print(i + " ");
		 * }
		 * for(;;) {
			System.out.println(무한루프);
			}
		 */
		System.out.println();
		
		for(int i = 0; ; i++) {
			if(i>10) {
				break;
			}
			System.out.println(i + " ");
		}
		System.out.println("무한루프 탈출");
	}

}
