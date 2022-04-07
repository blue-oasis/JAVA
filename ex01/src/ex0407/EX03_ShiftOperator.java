package ex0407;

public class EX03_ShiftOperator {

	public static void main(String[] args) {
		//산술 쉬프트(부호변화 없음, *2, /2)
		//Left shift
		System.out.println(3<<1); //6
		System.out.println(-3<<1); //-6
		System.out.println(3<<2); //12
		System.out.println(-3<<2); //-12
		System.out.println();

		//Right shift
		System.out.println(5>>1); //2
		System.out.println(-5>>1); //-3
		System.out.println(5>>2); //1
		System.out.println(-5>>2);//-2
		System.out.println();
		
		//논리쉬프트
		System.out.println(3>>>1); //1
		System.out.println(-3>>>31); //1
	}

}
