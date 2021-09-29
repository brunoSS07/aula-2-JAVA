package exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("digite um numero: ");
        numero = entrada.nextInt();

       double metade = (double)numero /2 ;


        if(numero > 20){
            System.out.println("A metade de " + numero + " é: " + metade);
        }

        entrada.close();
    }
}
