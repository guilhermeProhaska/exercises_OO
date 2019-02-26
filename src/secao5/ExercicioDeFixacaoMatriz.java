package secao5;

import java.util.Scanner;

public class ExercicioDeFixacaoMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inform values for N and M to create matriz:");
		System.out.print("Value for N: ");
		int n = sc.nextInt();
		System.out.print("Value for M: ");
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		System.out.println("Enter values for each cell:");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter a reference value to inform the positions:");
		
		int reference = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				
				if (matriz[i][j] == reference) {
					System.out.printf("Position " + i + "," + j + "%n");
					if(j > 0) {
						System.out.printf("Left: %d%n", matriz[i][j-1]);
					}
					if(j < matriz[i].length - 1) {
						System.out.printf("Right: %d%n", matriz[i][j+1]);
					}
					if(i > 0) {
						System.out.printf("Up: %d%n", matriz[i-1][j]);
					}
					if(i < matriz.length - 1) {
						System.out.printf("Down: %d%n", matriz[i+1][j]);
					}
				}
				
			}
		}
		
		sc.close();
	}

}
