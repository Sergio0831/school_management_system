package school.management.system;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by Sergejs Ivcenko on 17/07/2021. 
 * This class represent School object.
 *  Implement teachers, students and programms using ArrayList 
 */

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private List<Program> programms;
	//private List <Program> programms;
	private static double totalMoneyEarned;
	private static double totalMoneySpent;
	
	// New school object is created
	public School (List<Teacher> teachers, List<Student> students, List<Program> programms) {
		this.teachers = teachers;
		this.students = students;
		this.programms =  programms;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	} // constructor
	
	// Return the list of  teachers in the school
	public List<Teacher> getTeachers() {
		return this.teachers;
	}
	
	// Add a teacher to the School
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}
	
	// Return the list of the students of the school
	public List<Student> getStudents () {
		return this.students;
	}
	
	// Add a student to the school
	public void setStudents(Student student) {
		this.students.add(student);
	}
	
	// Return the list of the programms
	public List<Program> getProgramms() {
		return this.programms;
	}
	
	// Add a program to the school
	public void setProgramms(Program program) {
		this.programms.add(program);
	}
	
	// Return total money earned by the school
	public double getTotalMoneyEarned () {
		return totalMoneyEarned;
	}
	
	// Update totalMoneyEarned by the school
	public static void updateTotalMoneyEarned (double moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	// Return the totalMoneySpent by the school
	public double getTotalMoneySpent () {
		return totalMoneySpent;
	}
	
	// Update the totalMoneySpent by which is the salary given by the school
	// to the teacher salary.
	public static void updateTotalMoneySpent (double moneySpent) {
		totalMoneySpent += moneySpent;
	}
 	
} // class






















