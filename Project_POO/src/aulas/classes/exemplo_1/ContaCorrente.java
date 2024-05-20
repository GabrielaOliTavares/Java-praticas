package aulas.classes.exemplo_1;

public class ContaCorrente{
	private int numeroConta, agenciaConta;
	private double saldo;
	
	public void inicializarContaCorrente(int conta, int agencia) {
		numeroConta = conta;
		agenciaConta = agencia;
		saldo = 0;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
		
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
}