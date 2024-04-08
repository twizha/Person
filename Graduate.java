package person;

public class Graduate extends Student {
	public String degree;
	
	public Graduate(String name, int age, String gender, String studentId, String degree) {
		super(name,age,gender,studentId);
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
}
