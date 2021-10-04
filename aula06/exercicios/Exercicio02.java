package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int []numero = new int[3];
        System.out.println("Digite 3 numeros: ");

        for(int c=0; c < numero.length; c++){
            numero[c] = teclado.nextInt();
        }
        int menor1 = Integer.MAX_VALUE;

        int resp = menorNumero(numero,menor1);

        System.out.println("Menor numero é: "+ resp);

        teclado.close();
    }

    static int menorNumero(int val[],int menor){    
        for(int i = 0; i < val.length; i ++){
            if(val[i] < menor){
                menor = val[i];
            }
        }
        return menor;
    }
}
