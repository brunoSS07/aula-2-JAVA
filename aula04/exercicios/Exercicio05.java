import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, contPar, contImpar, cont;
        final int REP_MAX= 10; //constante não muda de valor

        contImpar = 0;
        contPar = 0;
        cont = 1;

        while(cont <= REP_MAX){
            System.out.printf("Escreva o %dº numero :", cont);
            num = entrada.nextInt();
            if(num % 2 == 0){
                //System.out.println("O numero "+ num + " é par.");
                contPar += 1;
            }else{
                //System.out.println("O número "+ num + " é, Ímpar.");
                contImpar += 1;
            }
            cont++;
        }
        System.out.println("Quantidade de numeros Pares é: " + contPar);
        System.out.println("Quantidade de numeros Pares é: " + contImpar);

        entrada.close();
    }
}
