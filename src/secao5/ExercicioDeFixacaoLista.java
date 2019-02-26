package secao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ExercicioDeFixacaoLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeList> list = new ArrayList<EmployeeList>();
		
		System.out.print("How many employees will be registered? ");
		int numberEmployees = sc.nextInt();
		
		
		for(int i = 1; i <= numberEmployees; i++) {
			
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			Integer employeeId = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Salary: ");
			Double employeeSalary = sc.nextDouble();
			System.out.println("");
			
			list.add(new EmployeeList(employeeId, employeeName, employeeSalary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idFind = sc.nextInt();
//*********************************************************************************************************		
		EmployeeList employeeList = list.stream().filter(x -> x.getId() == idFind).findFirst().orElse(null);
//*********************************************************************************************************
		if(employeeList != null) {
			System.out.print("Enter the percentage: ");
			Double percentageIncrease = sc.nextDouble();
			employeeList.increaseSalary(percentageIncrease);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("List of employees:");
		
		for(EmployeeList x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
