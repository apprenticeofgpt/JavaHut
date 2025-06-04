package mypack;

class Person {
	private int weight;
	int age;
	protected int height;
	protected String name;

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 30;
		name = "Jake";
		height = 200;
		setWeight(100);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
