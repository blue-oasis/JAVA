package ex0331;
import java.util.Vector;
public class VectorEx {

	public static void main(String[] args) {
		//정수값 벡터
		Vector<Integer> v = new Vector<>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100); //인덱스 지정 삽입
		
		System.out.println("백터 내의 요소 객체 수 : " + v.size());
		System.out.println("백터의 현재 용량 : " + v.capacity());
		
		for(int i = 0; i<v.size(); i++) { //백터 내 요소 출력
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i = 0; i<v.size(); i++) {//백터 내 정수 더하기
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("백터에 있는 정수 합 : " + sum);

	}

}
