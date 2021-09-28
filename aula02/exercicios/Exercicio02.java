package exercicios;


import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;

        System.out.println("Primeira nota é: ");
        nota1 = entrada.nextDouble();
        System.out.println("Segunda nota é: ");
        nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno é: "+ media);

        entrada.close();
    }
    
}
