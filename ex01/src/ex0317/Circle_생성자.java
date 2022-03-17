package ex0317;

public class Circle_생성자 {
	int radius;
	String name;
	
	public Circle_생성자() {
		radius = 1;
		name = "";
	}
	
	public Circle_생성자(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle_생성자 pizza = new Circle_생성자(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle_생성자 dount = new Circle_생성자();
		dount.name = "도넛피자";
		area = dount.getArea();
		System.out.println(dount.name + "의 면적은 " + area);

	}

}
