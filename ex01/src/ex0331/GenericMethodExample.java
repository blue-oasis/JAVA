package ex0331;

public class GenericMethodExample {
	//제네릭 메소드
	public static <T> GStack<T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>();
		while (true) { //스택 값 꺼내서 새 스택에 담고, 순서가 거꾸로 된 스택 리턴
			T tmp;
			tmp = a.pop();
			if(tmp==null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<>();
		
		for(int i =0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs = reverse(gs);
		for(int i = 0; i<5; i++) {
			System.out.println(gs.pop());
		}

	}

}
