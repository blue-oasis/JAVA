package ex0324;
class Shape{
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line"); //메소드 오버라이딩
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");//메소드 오버라이딩
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");//메소드 오버라이딩
	}
}
public class MethodOverridingEx {
	static void paint(Shape p) { //p가 가리키는 객체 내의 오버라이딩 된 draw 호출, 동적바인딩
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
