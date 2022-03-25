package ex0325;

public class WrapperEx {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); //소문자 변환
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) //c1이 숫자면 true
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2)) //c2가 영문자면 true
			System.out.println(c2 + "는 영문자");
		
		System.out.println(Integer.parseInt("-123")); //10진수 변환
		System.out.println(Integer.toHexString(28)); //16진수 문자열 변환
		System.out.println(Integer.toBinaryString(28)); //2진수 문자열 변환
		System.out.println(Integer.bitCount(28)); //2진수 1의 개수 카운트
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString()); //Double 문자열 변환
		System.out.println(Double.parseDouble("3.14")); //문자열 실수 변환
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b)); //Boolean값 문자열로 변환
		System.out.println(Boolean.parseBoolean("false"));//문자열 false 변환
		

	}

}
