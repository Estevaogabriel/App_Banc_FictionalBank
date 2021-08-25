package AcessoDoCliente;

import java.util.Scanner;

public class Banco {

	Scanner sc = new Scanner(System.in);
	
	private String nomeDoTitular ;
	private int numeroDaConta ;
	private double valorDaConta ;


	public Banco() {
	}

	public Banco(String nomedotitular, int numerodaconta, double valordaconta) {
		this.nomeDoTitular = nomedotitular;
		this.numeroDaConta = numerodaconta;
		this.valorDaConta = valordaconta;
	}

	public Banco(String nomedotitular, int numerodaconta) {
		this.nomeDoTitular = nomedotitular;
		this.numeroDaConta = numerodaconta;
	}


	public String getnomeDoTitular() {
		return nomeDoTitular;
	}

	public void setnomeDoTitular(String nomedotitular) {
		this.nomeDoTitular = nomedotitular;
	}
	public int getnumeroDaConta() {
		return numeroDaConta;
	}
	public double getvalorDaConta() {
		return valorDaConta;
	}


	public void criandoConta(String nome, int numeroDaConta, char depositar) {
	

	}



	public void saque(double a) {
		System.out.println("Saque realizado com sucesso!");
		valorDaConta -= (a+5);
	}

	public void deposito(double a) {
		System.out.println("Depósito realizado com sucesso!");
		valorDaConta += a;
	}

	public void alterarNome(String a) {
		nomeDoTitular = a;
	}

	public String toString() {
		return "Nome do Titular: " + nomeDoTitular
				+ "| Numero da conta: " + numeroDaConta +
				"| Saldo: R$" + valorDaConta;
	}


	public static void  impressaoDeQuestao() {
		System.out.println("Bem vindo ao FictionalBank");
		System.out.println("O melhor banco da ImaginarioLandia!");
		System.out.println("Já possui uma conta?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");

	}

	public static void impressaoDeMenu() {

		System.out.println("Que operação gostaria de realizar?");
		System.out.println("1 - Visualizar dados do usuário");
		System.out.println("2 - Visualizar saldo em conta");
		System.out.println("3 - Realizar um Saque");
		System.out.println("4 - Realizar um depósito");
		System.out.println("5 - Editar conta existente");
		System.out.println("6 - Criar Conta");

	}




}
