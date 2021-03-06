package main;

public class ContaCorrente implements Conta {

	private double saldo;
	private double taxaOperacao = 0.5;
	private Cliente donoConta;

	@Override
	public void depositar(double valor) {		
		this.saldo += valor - taxaOperacao;		
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor + taxaOperacao;		
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	public Cliente getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(Cliente donoConta) {
		this.donoConta = donoConta;
	}
	

}
