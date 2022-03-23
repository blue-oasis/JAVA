package ex0318;
class Sample{
	public int a;
	private int b;
	int c;
}

public class AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a =10; //퍼블릭
		aClass.c = 10; //프라이빗 맴버라 접근 불가
		aClass.c= 10; //디폴트 (같은 패키지)
		
	}

}
