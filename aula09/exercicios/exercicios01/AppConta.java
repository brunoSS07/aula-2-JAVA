package exercicios.exercicios01;

import java.util.Scanner;

import exercicios.exercicios01.dao.GerenciaContas;


public class AppConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valor;

        GerenciaContas contas =  new GerenciaContas();

        do {
            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Especial");
            System.out.println("3- Nova Conta Poupança");
            System.out.println("4- Depositar");
            System.out.println("5- Sacar");
            System.out.println("6- Consultar saldo");
            System.out.println("7- Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número da conta:");
                    numeroConta = entrada.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Digite o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do limite:");
                    limite = entrada.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.println("Digite o número da conta:");
                    numeroConta = entrada.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Digite o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do depósito:");
                    valor = entrada.nextDouble();

                    if (contas.depositar(numeroConta, valor)) {
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Falha ao realizar o depósito.");
                    }
                    break;

                case 5:
                    System.out.println("Digite o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do saque:");
                    valor = entrada.nextDouble();

                    if (contas.sacar(numeroConta, valor)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Falha ao realizar o saque.");
                    }
                    break;

                case 6:
                    System.out.println("Digite o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println(contas.saldo(numeroConta));
                    break;

                case 7:
                    break;

                default: // se não for nenhuma das opções
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        entrada.close();
    }
}
