package exercicios;

import java.util.Scanner;

/**
 * exercicio02
 */
public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, resultado;

        System.out.println("digite a 1 nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("digite a 2 nota: ");
        nota2 = entrada.nextDouble();
        
        resultado = (nota1 * 0.40) + (nota2 * 0.60);

        if(resultado >=6 ){
            System.out.println(resultado + " Aprovado");
        }else{
            System.out.println(resultado +" Reprovado");
        }

        entrada.close();
    }
}