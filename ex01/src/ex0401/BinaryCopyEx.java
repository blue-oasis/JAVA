package ex0401;
import java.io.*;

public class BinaryCopyEx {
	//이미지 복사
	public static void main(String[] args) {
		File scr = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("d:\\Temp\\copyimg.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(scr);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c=fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(scr.getPath() + "를 " + dest.getPath()
				+ "로 복사하였습니다.");
		}
		catch(IOException e){
			System.out.println("파일 복사 오류");
		}

	}

}
