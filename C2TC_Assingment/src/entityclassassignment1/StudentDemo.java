package entityclassassignment1;
import java.util.*;

public class StudentDemo {
	 public static void main(String[] args) {
	        Student s1 = new Student(101, "Arjun", "IT");
	        Student s2 = new Student(102, "Dhamo", "CSE");
	        Student s3 = new Student(103, "Kavi", "ECE");

	        System.out.println("Student Details:");
	        s1.display();
	        s2.display();
	        s3.display();
	    }

}
