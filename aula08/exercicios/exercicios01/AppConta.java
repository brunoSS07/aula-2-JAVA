package exercicios.exercicios01;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valor;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;

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
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do limite: ");
                    limite = entrada.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.println("digite o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    break;

                case 4:
                System.out.println("Informe o valor do depósito: ");
                valor = entrada.nextDouble();
                //Se o depositar der true deposito realizado
                if(cc.depositar(valor)){
                    System.out.println("Depósito realizado");
                }else{
                    System.out.println("Falha ao realizar depósito.");
                }
                    break;

                case 5:
                System.out.println("Digite o valor de saque: ");
                valor = entrada.nextDouble();
                if(cc.sacar(valor)){
                    System.out.println("Saque realizado.");
                }else{
                    System.out.println("Problema ao sacar.");
                }
                    break;

                case 6:
                System.out.println(cc);
                // System.out.println(ce);
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
