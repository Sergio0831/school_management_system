package school.management.system;

/*
 * Created by Sergejs Ivcenko on 17/07/2021. 
 * This class represent Student object.
 * Keeping the track of students fees, names, grade, programm.
 */

public class Student {
	
	// Private instances of a Class
	private int id;
	private String name;
	private Program program;
	private int grade;
	private Program fees;
	private double feesPaid;
	private double feesTotal;
	private double feesRemaining;
	
	// Student class constructor
	public Student (int id, String name, Program program, Program fees, int grade) {
		
		// Initialize values
		this.feesPaid = 0;
		this.feesRemaining = 0;
		this.feesTotal = 5000;
		this.id = id;
		this.name = name;
		this.program = program;
		this.fees = fees;
		this.grade = grade;
	} // constructor
		
		// Get the programm
		public Program getProgram() {
			return this.program;	
		}
		
		// Set the programm
		public void setProgram(Program program) {
			this.program = program;
		}
		
		// Get the programm
		public Program getProgramFees() {
			return this.fees;	
		}
		
		// Set the programm
		public void setProgramFees(Program fees) {
			this.fees = fees;
		}
		
		// Get the id
		public int getId() {
			return this.id;
		}
		
		// Set the grade
		public void setGrade(int grade) {
			this.grade = grade;
		}
		
		// Get the name
		public String getName() {
			return this.name;
		}
		
		// Get the grade
		public int getGrade() {
			return this.grade;	
		}
		
		// Get the fees paid
		public double getFeesPaid() {
			return this.feesPaid;
		}
		
		public void setFeesPaid(double feesPaid) {
			this.feesPaid = feesPaid;
		}
		
		// Update fees, that fees what the students pays.
		public void payFees(double fees) {
			feesPaid += fees;
			School.updateTotalMoneyEarned(feesPaid);
		}
		
		// Return the remaining fees
		public double getRemainingFees() {
			return fees.getFees() - feesPaid;
		}
		
		public String toString() {
			return "Student's name: " + name + "\n" + "Total fees paid: " + feesPaid + "\n" + "Fees remaining: " + getRemainingFees() + "\n" + "Grade: " + grade + "\n" + "Program: " + program.getTitle() + "\n";
		}
} // class





























