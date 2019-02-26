package exercicio1;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exercicio2Proposto {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an employee info:");
		System.out.print("Name: ");
		Employee emp = new Employee();
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp.toString());
		System.out.print("Which percentage to increase salary? ");
		double tax = sc.nextDouble();
		emp.increaseSalary(tax);
		System.out.println("Update data: " + emp.toString());
		
		sc.close();
	}
}
