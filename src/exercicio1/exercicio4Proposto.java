package exercicio1;

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;

public class exercicio4Proposto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dol = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double buy = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = R$%.2f", CurrencyConverter.dolarConverter(dol, buy));
		
		sc.close();

	}

}
