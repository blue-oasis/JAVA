package ex0407;

public class Ex08_ContinueControlKeyword {
	 // continue 키워드 실습
	public static void main(String[] args) {
		for(int i = 0 ; i<10; i++) {
			continue;
			//System.out.print(i+ " ");
		}
		
		for(int i = 0; i<10; i++) {
			System.out.println(i + " ");
			continue;
		}
		System.out.println();
		
		for(int i = 0; i<10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i + " ");
		}
		System.out.println();
		// 다중(이중 루프에서의 continue)
		for(int i= 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		//라벨 사용
		System.out.println();
		POS1 : for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j==3) {
					continue POS1;
				}
				System.out.println(i + ", " + j);
			}
		}
			
	}

}
