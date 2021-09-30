package exercicios;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("digite seu sálario: ");
        salario = entrada.nextDouble();
        System.out.println("Salário é de: " + salario);

        if (salario <= 600) {
            System.out.println("ISENTO");
        } else if (salario <= 1200) {
            System.out.println("20%");
        } else if (salario <= 2000) {
            System.out.println("25%");
        } else {
            System.out.println("30%");
        }

        entrada.close();
    }
}
