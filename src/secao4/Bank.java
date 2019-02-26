package secao4;

import java.util.Locale;
import java.util.Scanner;

import entities.DataAccount;

public class Bank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DataAccount data;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountName = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialAnswer = sc.next().charAt(0);
		
		if (initialAnswer != 'n') {
			System.out.print("Enter initial deposit value: ");
			double initialBalance = sc.nextDouble();
			data = new DataAccount(accountNumber, accountName, initialBalance);
		} else {
			data = new DataAccount(accountNumber, accountName);
		}
		
		
		System.out.printf("%n");
		System.out.println("Account data:");
		System.out.printf("" + data);
		
		System.out.printf("%n");
		System.out.print("Enter deposit value: ");
		double value = sc.nextDouble();
		data.depositAccount(value);
		System.out.printf("Update account data:%n" + data);
		
		System.out.printf("%n");
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		data.withdrawAccount(value);
		System.out.printf("Update account data:%n" + data);
		
		sc.close();		
	}

}
