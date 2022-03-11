package ex02;

public class NestedLoop {
	//구구단 출력
	public static void main(String[] args) {
		System.out.print("2단\t3단\t4단\t5단\t6단\t7단\t8단\t9단");
		System.out.println();
		for(int i = 1; i < 10; i++) { // 2단~9단
			for(int j = 2; j<10; j++) { 	//각 단 나란한 줄로 출력
				System.out.print(j + "*" + i + "="+ i*j);
				System.out.print('\t');
			}
			System.out.println(); //한 단 끝나면 줄바꿈
		}

	}

}
