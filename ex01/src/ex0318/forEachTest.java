package ex0318;

public class forEachTest {

	public static void main(String[] args) {
		int [][] a = {{1,2,3},{4,5},{6,7,8,9},{10}};
		
	for(int i=0; i<a.length; i++) {
		for(int k: a[i]) {
			System.out.print(k+" ");
		}
			System.out.println();
		}
	
	for(int k[]: a) {
		for(int y: k) {
		System.out.print(y+" ");
		}
		System.out.println();
		}

	}
}
