package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, quilowatt, valorQuilo, valorReais, valorDesconto;

        System.out.println("Salario Mensal: ");
        salario = entrada.nextDouble();
        System.out.println("Quantidade de quilowatts gasto: ");
        quilowatt = entrada.nextDouble();

        valorQuilo = salario/500;
        valorReais = valorQuilo * quilowatt;
        valorDesconto = valorReais * 0.85;

        System.out.printf("Valor de cada Quilowatts: R$ %.2f\n", valorQuilo);
        System.out.printf("Valor em Reais: R$ %.2f\n", valorReais);
        System.out.printf("Valor com desconto: R$ %.2f\n", valorDesconto);

        entrada.close();
    }
}
