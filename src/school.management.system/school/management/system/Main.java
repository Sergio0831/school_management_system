package school.management.system;

/*
 * Created by Sergejs Ivcenko on 17/07/2021. 
 * This is the Main class to create teacher and student objects.
 */
 
import java.util.ArrayList;
import java.util.List;

// javac -d out --module-source-path src --module school.management.system
// java --module-path out --module school.management.system/school.management.system.Main
 
 public class Main {
	 public static void main(String[] args) {
		 
		 // Create teachers
		 Teacher bark = new Teacher(1, "Mr. Bark", 500.00, "History");
		 Teacher meow = new Teacher(2, "Mr. Meow", 700.00, "Math");
		 Teacher piggy = new Teacher(3, "Ms. Piggy", 700.00, "Biology");
		 Teacher frog = new Teacher(3, "Ms. Froggy", 800.00, "Science");
		 
		 // Create a teacher ArrayList and add the teachers
		 List<Teacher> teachersList = new ArrayList<>();
		 teachersList.add(bark);
		 teachersList.add(meow);
		 teachersList.add(piggy);
		 teachersList.add(frog);
		 
		 // Create programms
		 Program math = new Program(101, "Math", new Teacher(meow.getName()), 5000);
		 Program history = new Program(102, "History", new Teacher(bark.getName()), 4000);
		 Program biology = new Program(103, "Biology", new Teacher(piggy.getName()), 4500);
		 Program science = new Program(104, "Science", new Teacher(frog.getName()), 2000);
		 
		 // Create a program ArrayList and add the programms
		 List<Program>programmsList = new ArrayList<>();
		 programmsList.add(math);
		 programmsList.add(history);
		 programmsList.add(biology);
		 programmsList.add(science);
		 
		 // Create students
		 Student paul = new Student(1, "Paul", new Program(math.getTitle()), new Program(math.getFees()), 3);
		 Student john = new Student(2, "John", new Program(math.getTitle()), new Program(math.getFees()), 4);
		 Student paula = new Student(3, "Paula", new Program(biology.getTitle()), new Program(biology.getFees()), 2);
		 Student nikole = new Student(4, "Nikole", new Program(history.getTitle()), new Program(history.getFees()), 1);
		 Student bob = new Student(5, "Bob", new Program(history.getTitle()), new Program(science.getFees()), 1);
		 
		 // Create a student ArrayList and add the students
		 List<Student> studentsList = new ArrayList<>();
		 studentsList.add(paul);
		 studentsList.add(john);
		 studentsList.add(paula);
		 studentsList.add(nikole);
		 studentsList.add(bob);
		 
		 
		 
		 // Create a School object
		School hes = new School(teachersList, studentsList, programmsList);	
		
		// Student paid fees
		paul.payFees(1000.00);
		john.payFees(3000.00);
		
		// Teachers get salary
		bark.receiveSalary(bark.getSalary());
		
		//System.out.println("School earned: " + hes.getTotalMoneyEarned());
		//System.out.println("School spent: " + hes.getTotalMoneySpent());
		
		// Display all programms
		 for(int i = 0; i < studentsList.size(); i++) {
			System.out.println(studentsList.get(i));
		 } 
		//System.out.println(bark);
	 } // main
 } // class
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 