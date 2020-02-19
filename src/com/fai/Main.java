package com.fai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Exercicio 1");

		int valor1;
		int valor2;
		int valor3;
		int valor4;
		int i = 0;

		System.out.println("Digite um valor: ");
		Scanner v = new Scanner(System.in);
		valor1 = v.nextInt();
		valor2 = v.nextInt();
		valor3 = v.nextInt();
		valor4 = v.nextInt();

		int menor = 0;
		int menor1 = 0;
		int menor2 = 0;
		int maior = 0;
		int maior1 = 0;
		int maior2 = 0;
		maior1 = Math.max(valor1, valor2);
		maior2 = Math.max(valor3, valor4);
		maior = Math.max(maior1, maior2);

		menor1 = Math.min(valor1, valor2);
		menor2 = Math.min(valor3, valor4);
		menor = Math.min(menor1, menor2);

		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);

		if (maior > 50) {
			System.out.println("Maior valor muito alto");
		} else {
			System.out.println("Valor normal");

		}

	}
}
