package br.com.erickfreire.separadigitos;

import java.util.Scanner;

/**
 * Programa em Java que separa digitos
 * @author Erick Freire
 * @version 1 - Criado em 01-05-2021 as 15:24
 */

public class SeparaDigitos {
	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que separa digitos de até 5 números: ");
		
		System.out.print("Digite um número entre 1 e 99999: ");
		numero = entrada.nextInt();
		
		while(numero < 1 || numero > 99999) {
			System.out.print("Número inválido - Digite um número entre 1 e 99999: ");
			numero = entrada.nextInt();
		}
		
		
		separaNumeros(numero);
		
	}
	
	public static void separaNumeros(int n) {
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		
		if(n < 10) {
			numero1 = n / 1;
			
			System.out.printf("%n%n%d", numero1);
		}
		if(n >= 10 && n < 100) {
			numero1 = n / 10;
			numero2 = (n % 10) / 1;
			
			System.out.printf("%n%n%d %d", numero1, numero2);
		}
		
		if(n >= 100 && n < 1000) {
			numero1 = n / 100;
			numero2 = (n % 100) / 10;
			numero3 = (n % 10) / 1;
			
			System.out.printf("%n%n%d %d %d", numero1, numero2, numero3);
		}
		
		if(n >= 1000 && n < 10000) {
			numero1 = n / 1000;
			numero2 = (n % 1000) / 100;
			numero3 = (n % 100) / 10;
			numero4 = (n % 10) / 1;
			
			System.out.printf("%n%n%d %d %d %d", numero1, numero2, numero3, numero4);
		}
		
		if(n >= 10000 && n < 100000) {
			numero1 = n / 10000;
			numero2 = (n % 10000) / 1000;
			numero3 = (n % 1000) / 100;
			numero4 = (n % 100) / 10;
			numero5 = (n % 10) / 1;
			
			System.out.printf("%n%n%d %d %d %d %d", numero1, numero2, numero3, numero4, numero5);
		}
	}

}
