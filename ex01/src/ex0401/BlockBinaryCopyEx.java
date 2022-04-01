package ex0401;
import java.io.*;
public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		File scr = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("d:\\Temp\\desert.jpg");
		try {
			FileInputStream fi = new FileInputStream(scr);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10]; //1024 = 1kb, 즉 10kb 버퍼 생성
			while(true) {
				int n = fi.read(buf); //버퍼 크기만큼 읽어서 버퍼에 저장, n은 실제 읽은 바이트
				fo.write(buf, 0, n); //버퍼 0부터 n 바이트까지 쓰기
				if(n < buf.length)
					break;
			}
		fi.close();
		fo.close();
		System.out.print(scr.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
		

	}

}
