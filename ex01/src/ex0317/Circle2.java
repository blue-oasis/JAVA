package ex0317;

class Circle3{
	
int radius;
public Circle3(int radius) {
	this.radius = radius;
}

public double getArea() {
	return 3.14*radius*radius;
}
	
}

public class Circle2 {
	
	public static void main(String[] args) {
		Circle3[] c; //객체배열 5칸 만듦
		c = new Circle3[5];
		
		for(int i = 0; i<c.length; i++) { //배열안 객체에 값 할당 0~4
			c[i] = new Circle3(i);
		}
		for(int i = 0 ; i<c.length; i++) { //객체배열의 메소드에 접근하여 출력
			System.out.print((int)(c[i].getArea()) + " ");
		}
	}

}
