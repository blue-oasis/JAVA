package ex0413;
//클래스의 상속과 사용할 수 있는 맴버 실습

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human{
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{
	int workerID;
	void goToWork() {}
}

public class Inheritance {

	public static void main(String[] args) {
		//Human 객체
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//Student 객체
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128; //추가정의
		s.eat();
		s.sleep();
		s.goToSchool(); //추가정의
		
		//Worker 객체
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128; //추가정의
		w.eat();
		w.sleep();
		w.goToWork(); //추가정의

	}

}
