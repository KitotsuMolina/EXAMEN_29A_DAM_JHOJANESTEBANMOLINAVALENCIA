package examen_29a_primo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Buenos días Ceinmark, soy Marta Gómez");
		System.out.print("Introduce un número para averiguar si es primo o no: ");

		int numero = teclado.nextInt();

		if (esPrimo(numero)) {
			System.out.println(numero + " es primo.");
		} else {
			System.out.println(numero + " no es primo.");
		}

		teclado.close();
	}

	private static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}

		for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}

		return true;
	}
}
