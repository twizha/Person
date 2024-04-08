package person;

public class Undergraduate extends Student{
	public String course;
	
	public Undergraduate(String name, int age, String gender, String studentId, String course) {
		super(name, age, gender, studentId);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
