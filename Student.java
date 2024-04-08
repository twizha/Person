package person;

public class Student extends Person{
	public String studentId;
	
	public Student(String name, int age, String gender, String studentId) {
		super(name,age,gender);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
