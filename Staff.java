package person;

public class Staff extends Employee {
	public String position;
	
	public Staff (String name, int age, String gender, String employeeId, String position, double basicSalary, double overtimePay, double sssDeduction, double philhealthDeduction, double taxDeduction) {
		super(name,age,gender,employeeId, basicSalary, overtimePay, sssDeduction, philhealthDeduction, taxDeduction);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
