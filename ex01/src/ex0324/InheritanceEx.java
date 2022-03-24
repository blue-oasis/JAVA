package ex0324;
class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30; //디폴트 맴버 접근 가능
		name = "홍길동"; //퍼블릭 맴버 접근 가능
		height = 175; //프로텍티드 멤버 접근 가능
		// weight = 99; 오류, 프라이빗 맴버 접근 불가
		setWeight(99); // 함수로 간접접근
		
	}
	public void getPrint() {
		System.out.print("나이는 " + age+ "살 이름은 " + name + " 키는 "+ height +
				" 몸무게는 "+ getWeight());
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.getPrint();
	}

}
