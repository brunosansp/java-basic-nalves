package br.com.java.basic;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		char rest;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();

			double F = 9 * C / 5 + 32;

			System.out.printf("A temperatura equivalente de Celsius em Fahrenheit é: %.1f%n", F);

			System.out.print("Desejava repetir? (s/n): ");
			rest = sc.next().charAt(0);

		} while (rest != 'n');

		sc.close();

	}

}
