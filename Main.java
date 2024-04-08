package person;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Trizha Mae Andrea Lariosa", 20, "F");
		Student student = new Student(person.getName(), person.getAge(), person.getGender(), "202200068");
		Employee employee = new Employee("Joannou H. Fegarido", 35, "M", "E20104560", 3000, 50, 100, 150, 100);
		
		Course course = new Course ("Information Technology", "ITE 206");
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(student);
		
		for (Student s : students) {
			System.out.println("\nStudent's Information");
			System.out.print("-----------------------------------");
			System.out.println("\nName: " + s.getName());
			System.out.println("Age: " + s.getAge());
			System.out.println("Gender: " + s.getGender());
			System.out.println("Student ID: " + s.getStudentId());
			System.out.println("Course: " + course.getCourseName());
		}
		
		System.out.println("\nEmployee's Income Details ");
		System.out.print("-----------------------------------");
		System.out.println("\nName: " + employee.getName());
		System.out.println("Employee ID: " + employee.getEmployeeId());
		employee.displayIncome();
	}
}
