package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero:");
        numero = teclado.nextInt();
        
        if(verificarPar(numero)){
            System.out.println(numero +" é PAR");
        }else{
            System.out.println(numero +" é IMPAR");
        }

        teclado.close();
        
    }

    static boolean verificarPar(int num){
        /*if(num % 2 == 0){
            return true;
        }else{
            return false;
        }*/

        return num % 2 == 0;
    }

}
