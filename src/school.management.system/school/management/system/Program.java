package school.management.system;

/*
 * Created by Sergejs Ivcenko on 17/07/2021. 
 * This class represent Program object.
 * Keeping the track of program name, fees, teacher.
 */
 
 public class Program {
	  
	  // Instance variables
		private int ID;
		private String title;
		private Teacher teacher;
		private double fees;
	  
	  // Program class constructor
	  public Program(Teacher teacher) {
		  this.teacher = teacher;
	  }
	  
	  public Program(String title) {
		  this.title = title;
	  }
	  
	  public Program(double fees) {
		  this.fees = fees;
	  }
	  
	  public Program(int ID, String title, Teacher teacher, double fees) {
		  this.ID = ID;
		  this.title = title;
		  this.teacher = teacher;
		  this.fees = fees;
	  } // constructor
	  
	  // Get the ID
	  public int getID() {
		  return this.ID;
	  }
	  
	  // Get the program name
	  public String getTitle() {
		  return title;
	  }
	  
	  // Set the program name
	  public void setTitle(String title) {
		  this.title = title;
	  }
	  
	  // Get the programm teacher
	  public Teacher getTeacherName() {
		  return teacher;
	  }
	  
	  // Set program teacher name
	  public void setTeacherName(Teacher teacher) {
		  this.teacher = teacher;
	  }
	  
	  // Get the programm fees
	  public double getFees() {
		  return fees;
	  }
	  
	  // Set program fees
	  public void setFees(double fees) {
		  this.fees = fees;
	  }
	  
	  public String toString() {
		  return "Program title: " + title + "\n" + "Program teacher: " + teacher.getName() + "\n" + "Program fees: " + fees + "\n";
	  }
	  
 }// class
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 