package aula04;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 1;
		
		System.out.println("Digte um número inteiro:");
		int numero = leia.nextInt();
		
		while(contador <= 10) {
			System.out.printf("\n %d x %d = %d", numero, contador, (numero * contador));
			contador ++;
		}

	}

}
