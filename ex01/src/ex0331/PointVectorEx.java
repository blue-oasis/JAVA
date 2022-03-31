package ex0331;

import java.util.Vector;

class Point{
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() { //toString 오버라이딩
		return "(" + x + "," + y + ")";
	}
}
public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<>(); //객체 요소가 Point인 벡터 생성
		
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1); //인덱스 1에 위치한 값 삭제
		
		
		for(int i = 0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p); //p.toString() 이용 객체 출력
		}
		
	}

}
