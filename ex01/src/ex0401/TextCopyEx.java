package ex0401;
import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		File scr = new File("c:\\Windows\\system.ini"); //원본 파일 경로
		File dest = new File("d:\\temp\\system.txt"); //복사 파일 경로
		int c;
		try {
			FileReader fr = new FileReader(scr);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) { //문자 하나씩 읽고 씀
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println(scr.getPath()+"를 " + dest.getPath()+ "로 복사하였습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
