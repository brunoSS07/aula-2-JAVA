package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salarioNovo;

        System.out.println("Salario atual é: ");
        salario = entrada.nextDouble();

        salarioNovo = salario + (salario * 0.25);

        System.out.println("O novo salario é: " + salarioNovo);
        // printf([FORMATO], Valores)
        // %d = numero inteiro
        // %f = numero não inteiro
        // %s = string (texto)

        System.out.printf("Resposta %d\n",10);
        System.out.printf("O quadrado de %d é %d\n",5, 5*5);
        System.out.printf("A média é %.2f", 10.456);

        entrada.close();
    }
}
