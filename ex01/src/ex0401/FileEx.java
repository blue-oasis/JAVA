package ex0401;
import java.io.File;
public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트입니다.");
		File[] subFiles = dir.listFiles(); //파일 객체 배열에 파일리스트 저장
		
		for(int i = 0 ; i<subFiles.length; i++) {
			File f =subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("\t파일 크기:" + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("c:\\Windows\\system.ini");
		//경로 getPach, 상위경로 getParent, 이름 getName
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " 
				+ f1.getName());
		String res = "";
		if(f1.isFile()) //파일인지 검사
			res = "파일";
		else if(f1.isDirectory()) //디렉토리인지 검사
			res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		
		File f2 = new File("d:\\Temp\\java_sample");
		if(!f2.exists()) { 
			f2.mkdir(); // 해당 경로 없으면 mkdir 디렉토리 1개 생성, mkdirs 는 여러개
		}
		listDirectory(new File("d:\\Temp")); //파일리스트 출력 listDirectory
		f2.renameTo(new File("d:\\Temp\\javasample")); //이름 바꾸기 renameTo
		listDirectory(new File("d:\\Temp"));
	}

}
