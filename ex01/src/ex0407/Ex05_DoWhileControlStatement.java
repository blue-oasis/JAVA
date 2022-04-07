package ex0407;

public class Ex05_DoWhileControlStatement {

	public static void main(String[] args) {

// do-while의 기본문법구조, do-while vs while의 비교 실습
		//#1. 반복회수가 0인 경우 do-while과 while 문 비교
		int a;
		a = 0;
		while(a<0) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a<0);
		System.out.println();
		
		//#2. 반복회수가 1인 경우 do-while과 while 문 비교
		a = 0;
		while(a<1) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a<1);
		System.out.println();
		
		//#3. 반복회수가 10인 경우 do-while과 while 문 비교
		a = 0;
		while(a<10) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a<10);
		
		

	}

}
