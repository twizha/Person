package person;

public class Employee extends Person {
	public String employeeId;
	public double basicSalary;
	public double overtimePay;
	public double sssDeduction;
	public double philhealthDeduction;
	public double taxDeduction;
	
	public Employee(String name, int age, String gender, String employeeId, double basicSalary, double overtimePay, double sssDeduction, double philhealthDeduction, double taxDeduction) {
		super(name,age,gender);
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
		this.overtimePay = overtimePay;
		this.sssDeduction = sssDeduction;
		this.philhealthDeduction = philhealthDeduction;
		this.taxDeduction = taxDeduction;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public double computeSalary() {
		return basicSalary;
	}
	public double computeOvertimePay(double hoursWorked) {
		return hoursWorked * overtimePay;
	}
	public double computeDeduction() {
		return sssDeduction + philhealthDeduction + taxDeduction;
	}
	public double computeGrossIncome(double hoursWorked) {
		return computeSalary() + computeOvertimePay(hoursWorked);
	}
	public double computeNetIncome(double hoursWorked) {
		return computeGrossIncome(hoursWorked) - computeDeduction();
	}
	public void displayIncome() {
		System.out.println("Basic Salary: $" + basicSalary);
		System.out.println("Overtime Pay Rate: $" + overtimePay);
		System.out.println("SSS Deduction: $" + sssDeduction);
		System.out.println("PhilHealth Deduction: $" + philhealthDeduction);
		System.out.println("Tax Deduction: $" + taxDeduction);
		System.out.println("Gross Income: $" + computeGrossIncome(10));
		System.out.println("Net Income: $" + computeNetIncome(10));
	}
}
