package ex03;

public class foreachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}

	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int sum = 0;
		
		for (int k : n) { //배열 n 출력, 합계 구하기
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		for(String s : names) { //스트링 names 출력
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day : Week.values()) { //Week 출력
			System.out.print(day + "요일 ");
		}
		System.out.println();
	}

}
