package ex0401;
import java.io.*;
public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\Windows\\system.ini"); //파일 읽어오기
			int c;
			while((c=fin.read()) != -1) { //파일 끝(-1)까지 읽기
				System.out.print((char)c); //형변환해서 출력
			}
			fin.close();
		}
		catch(IOException e) { //IO 작업 시 예외처리 필수
			System.out.println("입출력 오류");
		}
	}

}
