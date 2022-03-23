package ex0323;
import java.util.Scanner;
class PrimeNumber{
	//필드
	private int small;
	private int big;
	private boolean[] pn = new boolean[big];
	private int count = 0;
	//생성자
	public PrimeNumber(int n, int m) {
		if(n>m) {
			big = n;
			small = m;
		}
		else {
			big = m;
			small = n;
		}
	}
	//소수 판정 메소드 primegen
	public void primegen() {
		boolean[] p = new boolean[big];
		
			for(int i =0; i<p.length; i++) {
				p[i] = true;
			}
			p[0] = p[1] = false;
			//소수 판정 논리
			for(int i =0; i<p.length; i++) {
				if(p[i]==true) {
					for(int j = i*2; j<p.length; j+=i) {
						p[j] = false;
					}
				}
			}
			pn = p;
	}
	//소수 출력 메소드
	public void primePrint() {
		count = 0;
		for(int i =0; i<pn.length; i++) {
			if(pn[i]==true) {
				System.out.print(i +  " ");
				count++;
				if(count%10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.print("\n소수의 갯수는 " +  count + "개 입니다.");
	}
	
}
public class PrimeGen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
	do {
		System.out.print("소수를 구할 범위 첫번째 양의 정수를 입력해 주세요: ");
		n = in.nextInt();
		System.out.print("소수를 구할 범위 끝의 양의 정수를 입력해주세요: ");
		m = in.nextInt();
		
		if (n == m)
			 System.out.print("같은 값을 입력하였습니다. 다시 입력하세요!");
		
		else 
			break;
		}while(true);
		
	PrimeNumber prime = new PrimeNumber(n, m);
	prime.primegen();
	prime.primePrint();
	
	in.close();
	
	}
}