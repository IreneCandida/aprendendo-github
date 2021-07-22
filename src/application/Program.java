package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ContaBancaria conta;
				
		System.out.print("Enter account number:  ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder:  ");
		 String nome = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?  ");
		char resp = sc.next().charAt(0);
		if(resp == 'y') {
			System.out.print("Enter initial deposit value:  ");
			double depositoInicial = sc.nextDouble()
;			conta = new ContaBancaria(nome, num, depositoInicial);
			
		}
		else {
			
			conta = new ContaBancaria(nome, num);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println("Updated account data: ");
		System.out.println(conta);
					
		sc.close();
		
	}

	

}
