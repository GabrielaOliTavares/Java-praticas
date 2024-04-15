package hotel;

import java.util.Scanner;


public class hotel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Faça um programa que leia a tipo de apartamento e a
quantidade de dias em que um hóspede esteve no hotel, e
calcule o total a ser pago pelo mesmo. */
		
		System.out.println("Digite o tipo de apartamento em que ficou hospedado(Apto simples ou Apto duplo): ");
		String tipoAp = input.nextLine();
		
		System.out.println("Digite a quantidade de dias hospedados: ");
		int quantDias = input.nextInt();
		
		
		if (tipoAp.equalsIgnoreCase("apto simples")) {
			if(quantDias < 10) {
				System.out.println("O total é a ser pago é: " + quantDias*100);
			}
			if(quantDias > 10 && quantDias < 15) {
				System.out.println("O total é a ser pago é: " + quantDias*90);
			}
			if(quantDias > 15) {
				System.out.println("O total é a ser pago é: " + quantDias*80);
			}
		}
		
		if (tipoAp.equalsIgnoreCase("apto duplo")) {
			if(quantDias < 10) {
				System.out.println("O total é a ser pago é: " + quantDias*140);
			}
			if(quantDias > 10 && quantDias < 15) {
				System.out.println("O total é a ser pago é: " + quantDias*120);
			}
			if(quantDias > 15) {
				System.out.println("O total é a ser pago é: " + quantDias*100);
			}
		}
			
		
		
		
		
		
	}
}