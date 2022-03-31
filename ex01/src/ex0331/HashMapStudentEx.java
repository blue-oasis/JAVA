package ex0331;
import java.util.*;

class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		//(학생이름, student(id, 전화번호)) HashMap
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = in.next();
			if(name.equals("exit"))
				break;
			Student student = map.get(name); //이름에 해당하는 객체 검색
			if(student== null)
				System.out.println(name + "은 없는 사람입니다.");
			else
				System.out.println("id:" + student.id + ", 전화:" + student.tel );
		} //객체 맴버에 접근해서 출력
		in.close();
	}

}
