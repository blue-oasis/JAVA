package ex0401;
import java.io.*;
import java.util.Scanner;
public class BuffereadIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("test.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c = fin.read()) != -1){
				out.write(c); //버퍼가 꽉 찰 때 출력
			}
			
			new Scanner(System.in).nextLine(); //엔터키 기다림
			out.flush(); //버퍼에 남은 문자 전체 출력
			fin.close();
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
