package hotel;

import java.util.Scanner;

/* 2. Faça um programa que receba dois números e escolha:
a. Somar números
b. Subtrair números
c. Multiplicar números (sem utilizar o operador *).  */ 
public class operacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = input.nextInt();
		
		System.out.println("Digite outro numero: ");
		int n2 = input.nextInt();
		
		int resultado = 0;
		
		System.out.println("A soma entre os numero é: "+ (n1 + n2));
		System.out.println("A subtracao entre os numero é: "+ (n1 - n2));
		
		
		for(int i = 0; i < n2; i++) {
			resultado += n1;
		}
		System.out.println("A multiplicacao é: " + resultado);
		
		
		
	}
	
}