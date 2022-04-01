package ex0401;
import java.io.*;
import java.util.*;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("test.txt"); //상대주소 프로젝트 폴더 안에 파일 존재
			while(true) {
				String line = in.nextLine();
				if(line.length() == 0) { //입력 안하고 엔터 누르면 종료
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2); //줄바꿈, 2전까지 읽음, \r 커서 오른쪽, \n 줄바꿈
			}
			fout.close();
		}	
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		in.close();

	}

}
