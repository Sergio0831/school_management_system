package school.management.system;

/*
 * Created by Sergejs Ivcenko on 17/07/2021. 
 * This class represent Teacher object.
 * Keeping the track of teacher names, salary and programm.
 */

public class Teacher {
	
	// Declare fields
	private int id;
	private String name;
	private double salary;
	private double salaryEarned;
	private String program;
	
	// Create constructor
	
	
	public Teacher(String name) {
		this.name = name;
	}
	
	public Teacher (int id, String name, double salary, String program) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.program = program;
		this.salaryEarned = 0;
	}
	
	public int getId() {
		return this.id;
	}
	
	// Get teacher name
	public String getName() {
		return this.name;
	}
	
	// Set teacher name
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String getProgram() {
		return this.program;
	}
	
	// Set the salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Add salary and removes from school total money spenr
	public void receiveSalary(double salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salaryEarned);
	}
	
	
	
	public String toString() {
		return "Teacher's name: " + name + "\n" + "Teacher salary: " + salary + "\n" + "Program: " + program;
	}
	
} // class

















