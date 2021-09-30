package exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite 2 numeros: ");

        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();

        System.out.println("Ordem digtiado: "+ num1 + " " + num2 + "\n");
        
        if(num1 > num2) {
            System.out.println("Numeros digitados em ordem não crescente: " + num1 + " e "+ num2);
        }else {
            System.out.println("Numeros digitados em ordem não crescente: " + num2+ " e "+ num1);

        }

        entrada.close();
    }
}
