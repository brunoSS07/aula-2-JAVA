package exemplos;

import java.util.Scanner;


public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("digite a nota do aluno: ");
        nota  = entrada.nextDouble();

        if(nota >= 6){
            System.out.println("Aluno APROVADO!");
        }

        System.out.println("Fim do programa");

        entrada.close();
    }
}