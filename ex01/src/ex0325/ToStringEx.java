package ex0325;
class Point2{
	private int x, y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() { //toString 오버라이딩
		return "Point2(" + x + ","+ y +")";
	}
}
public class ToStringEx {

	public static void main(String[] args) {
		Point2 p = new Point2(2,3);
		System.out.println(p.toString());
		System.out.println(p); //p.toString으로 자동 변환
		System.out.println(p + "입니다.");
	}

}
