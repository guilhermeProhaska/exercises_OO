package exercicio1;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class exercicio3Proposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inform the student full name:");
		Student student1 = new Student();
		student1.name = sc.nextLine();
		System.out.println("Inform all trimesters grades:");
		System.out.print("First grade: ");
		student1.tri1 = sc.nextDouble();
		System.out.print("Second grade: ");
		student1.tri2 = sc.nextDouble();
		System.out.print("Third grade: ");
		student1.tri3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student1.finalGrade());
		student1.passStudent();

		sc.close();
	}

}
