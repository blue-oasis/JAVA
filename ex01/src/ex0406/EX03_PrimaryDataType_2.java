package ex0406;

public class EX03_PrimaryDataType_2 {

	public static void main(String[] args) {
		//char 타입, 문자와 정수로 저장
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();
		
		char value4 = 65;
		char value5 = 0xac00;
		char value6 = 51;
		System.out.println(value4); //A
		System.out.println(value5);//가
		System.out.println(value6); //3
		System.out.println();
		//유니코드 입력
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		System.out.println(value7); //A
		System.out.println(value8); //가
		System.out.println(value9); //3
				
	}

}
