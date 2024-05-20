package aulas.classes.exemplo_1;

import java.util.Scanner;

public class BancoUna {
	public static void main(String[] args) {
		
		// Instanciando a classe Scanner e transformando em um objeto
		Scanner inputTerminal = new Scanner(System.in);
		
		// Instanciando a classe ContaCorrente e transformando em um objeto.
		ContaCorrente minhaConta = new ContaCorrente();
		
		double valorDeposito = 0.0;
		
		//Define o numero da conta e da agência
		minhaConta.inicializarContaCorrente(22347, 243);
		
		//Realiza um deposito de R$ 1000,00 na conta e na sequencia um outro deposito de R$ 545,34
		minhaConta.depositar(1000.00);
		minhaConta.depositar(545.34);
		
		//Permite que o usuario realize um deposito na conta
		System.out.print("Digite o valor do deposito: ");
		valorDeposito = inputTerminal.nextDouble();
		minhaConta.depositar(valorDeposito);
		
		//Consultar o saldo da conta
		double saldoConta = minhaConta.consultarSaldo();
		
		System.out.format("Saldo da sua conta é: R$ %.2f", saldoConta);
		inputTerminal.close();
				
		
		
	}
}