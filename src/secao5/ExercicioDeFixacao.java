package secao5;

import java.util.Scanner;

import entities.RentRoom;

public class ExercicioDeFixacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		RentRoom[] rent = new RentRoom[10];
		
		for (int i = 1; i <= rooms; i++) {
			
			System.out.printf("Rent #%d%n",i);
			System.out.printf("Name: ");
			sc.nextLine();
			String studentName = sc.nextLine();
			System.out.printf("Email: ");
			String studentEmail = sc.nextLine();
			System.out.printf("Room: ");
			int studentRoom = sc.nextInt();
			
			rent[studentRoom] = new RentRoom(studentName, studentEmail);
		}
		
		System.out.println("Busy rooms");
		for (int i = 0; i < rent.length; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);	
			}
		}
		
		sc.close();
	}

}
