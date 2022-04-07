package ex0407;

public class EX02_BitwiseOperator {

	public static void main(String[] args) {
		//진법변환 메소드
		int data = 13;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15", 8));
		System.out.println(Integer.parseInt("0D", 16));
		System.out.println();
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101); //2진
		System.out.println(015); //8진
		System.out.println(0x0D); //16진
		System.out.println();
		
		//bit AND
		System.out.println(3 & 10); //2
		System.out.println(0b0011 % 0b1010); //3
		System.out.println(0x03 & 0x0A); //2
		System.out.println();
		
		//bit OR
		System.out.println(3 | 10); //11
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x03 | 0x0A);
		System.out.println();
		
		//bit XOR
		System.out.println(3 ^ 10); //9
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		System.out.println();

		//bit NOT
		System.out.println(~3); //-4
		System.out.println(~0b0011);
		System.out.println(~0x03);
		System.out.println();
	}

}
