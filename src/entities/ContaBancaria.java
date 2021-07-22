package entities;

public class ContaBancaria {
	
	private String nomeTitular;
	private int numConta;
	private double saldo;	

	public ContaBancaria(String nomeTitular, int numConta) {
		this.nomeTitular = nomeTitular;
		this.numConta = numConta;
				
	}
	
	public ContaBancaria(String nomeTitular, int numConta, double depositoInicial) {
		this.nomeTitular = nomeTitular;
		this.numConta = numConta;
		deposito(depositoInicial);
		
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
		
	}
	
	public int getNumConta() {
		return numConta;
	}
	
		
	public double getSaldo () {
		return saldo;
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
		
	}
	
	public void saque(double saque){
		saldo -= saque + 5.00;
		
	}
	
	public String toString() {
		return	"Account  "
				+ numConta 
				+ ", Holder: " 
				+ nomeTitular
				+ ", Balance: $ " 
				+ String.format("%.2f", saldo);
		
	}

}