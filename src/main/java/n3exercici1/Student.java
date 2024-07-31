package n3exercici1;

public class Student {
	
	private String name;
	private int age;
	private String course;
	private int grade;
	
	
	public Student(String name, int age, String couse, int grade) {
		this.name = name;
		this.age = age;
		this.course = couse;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String couse) {
		this.course = couse;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return name + ", age=" + age + ", couse=" + course + ", grade=" + grade;
	}
	
	
	
	

}
