package AcessoDoCliente;

import java.util.Scanner;

public class InteracaoComUsuario {

	public static void main(String[] args) {

		//iniciando o que precisa ser iniciado
		Scanner sc = new Scanner(System.in);
		Banco banco = new Banco(); //tenho que corrigir esta falha
		char teste = 'n';


		//Imprimindo a questão de ter, ou não, uma conta

		//Banco.impressaoDeQuestao();
		//int questao = sc.nextInt();


		//Caso não tenha uma conta, é obrigatório criar uma
		//if(questao == 2) {


		//System.out.println("Gostaria de realizar outra operação?");
		//teste = sc.next().charAt(0);


		//}if(questao == 1 || teste == 's') {

		//impressão do Menu padrão
		do {
			Banco.impressaoDeMenu();
			System.out.print("");
			System.out.print("Escolha: ");
			int escolha = sc.nextInt();

			//Lógica das escolhas
			switch(escolha) {
			//Caso ele queira visualizar um usuário
			case 1:
				if(banco.getnumeroDaConta() == 0.0) {
					System.out.println("Nenhum usuário registrado em nosso banco de dados.");
					break;
				}
				System.out.println("Entre com o nome da conta: ");
				String nome1 = sc.next();
				System.out.println("Entre com o Número da conta: ");
				int numerodaconta = sc.nextInt();
				if(nome1.equals(banco.getnomeDoTitular()) && numerodaconta == banco.getnumeroDaConta()) {

					System.out.println("Informações da conta: ");
					System.out.println(banco.toString());

				}else {
					System.out.println("Nome ou número da conta Inválidos!");
				}

				break;

				//caso ele queira visualizar o saldo em conta
			case 2:
				System.out.println("O saldo na conta é: " + banco.getvalorDaConta());

				break;


				//caso ele queira realizar um saque
			case 3:
				System.out.print("Insira o valor a ser sacado: ");
				double saque = sc.nextDouble();
				if(saque > banco.getvalorDaConta()) {
					System.out.println("Seu saldo em conta é de: " + banco.getvalorDaConta());
					System.out.println("O saque excedeu o limite!");

				}else {
					banco.saque(saque);
					System.out.println("Novo saldo é: " + banco.getvalorDaConta());
				}
				break;

				//caso ele queira realizar um depósito
			case 4:
				System.out.print("Insira o valor a ser Depositado: ");
				double deposito = sc.nextDouble();
				banco.deposito(deposito);
				System.out.println("Novo saldo é: " + banco.getvalorDaConta());
				break;
				//Caso ele queira alterar o nome da conta
			case 5:
				System.out.println("Entre com o nome da conta atual: ");
				String nome2 = sc.next();
				if(nome2.equals(banco.getnomeDoTitular())){
					System.out.println("Insira o novo nome: ");
					String newname = sc.next();
					banco.alterarNome(newname);
				}
				System.out.println("Novo nome em conta é: " + banco.getnomeDoTitular());
				System.out.println(banco.toString());
				break;

				//Caso queira criar uma conta
			case 6:
				System.out.print("Entre com o Nome do Titular da conta: ");
				String nome = sc.next();
				System.out.print("Entre com o Número da conta: ");
				int numeroDaConta = sc.nextInt();
				System.out.print("Deseja depositar algum valor inicial?");
				char depositar = sc.next().charAt(0);

				if(depositar == 's') {
					System.out.print("Entre com o valor a ser depositado:  ");
					deposito = sc.nextDouble();
					banco = new Banco(nome, numeroDaConta, deposito);		
				}else {

					banco = new Banco(nome, numeroDaConta);
				}
				System.out.println("Conta criada!");
				System.out.println(banco.toString());

				break;
				//Caso a opção desejada não seja válida!
			default:
				System.out.println("Opção Inválida!");
				System.out.println("Digite uma opção válida.");
				break;
			}


			System.out.println("Gostaria de realizar outra operação?");
			teste = sc.next().charAt(0);

		}while(teste != 'n');


		System.out.println("Até a próxima!");
		sc.close();
	}

}


