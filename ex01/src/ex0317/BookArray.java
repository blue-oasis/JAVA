package ex0317;
import java.util.Scanner;

class Book3{
	String title, author;
	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {

	public static void main(String[] args) {
		Book3[] book = new Book3 [2]; //2칸 book 배열 선언
		
		Scanner in = new Scanner(System.in);
		for(int i = 0; i<book.length ; i++) { //배열 크기만큼 제목, 저자 입력받음
			System.out.print("제목>>");
			String title = in.nextLine(); //nextLine 한 줄 입력받기
			System.out.print("저자>>");
			String author = in.nextLine();
			book[i] = new Book3(title, author); //인덱스별 할당
		}

		for(int i = 0; i<book.length; i++) { //순서대로 출력
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		}
		in.close();
	}

}
