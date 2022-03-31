package ex0331;
import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		//Iterator 이용 정수 출력
		Iterator<Integer> it = v.iterator(); //레퍼런스 변수 생성, iterator() 함수
		while(it.hasNext()) { //벡터 길이만큼 true
			int n = it.next();
			System.out.println(n);
		}

		int sum = 0;
		it = v.iterator(); //iterator 객체 얻기
		while(it.hasNext()) { //모든 원소의 합 구하기
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " +  sum);
	}

}
