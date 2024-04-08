package person;

public class Faculty extends Employee {
	public String department;
	
	public Faculty (String name, int age, String gender, String employeeId, String department, double basicSalary, double overtimePay, double sssDeduction, double philhealthDeduction, double taxDeduction) {
		super(name,age,gender,employeeId, basicSalary, overtimePay, sssDeduction, philhealthDeduction, taxDeduction);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
