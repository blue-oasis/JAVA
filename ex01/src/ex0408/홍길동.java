package ex0408;

public class 홍길동 {

	public static void main(String[] args) {
		String str = ("내 이름은[홍길동] 입니다. 나이는[15]살 입니다.");
		int nameStart = (str.indexOf('[') + 1);
		int nameEnd = str.indexOf(']');
		String name = str.substring(nameStart, nameEnd);

		int ageStart = (str.lastIndexOf('[') +1);
		int ageEnd = str.lastIndexOf(']');
		int age = Integer.parseInt(str.substring(ageStart, ageEnd));
		System.out.println(name + age);
		

	}

}
