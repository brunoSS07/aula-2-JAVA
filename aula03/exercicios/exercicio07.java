package exercicios;

import java.util.Scanner;

/**
 * exercicio07
 */
public class exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.println("1º lado do triângulo");
        ladoA = entrada.nextInt();
        System.out.println("2º lado do triângulo");
        ladoB = entrada.nextInt();
        System.out.println("3º lado do triângulo");
        ladoC = entrada.nextInt();

        if(ladoA > (ladoB + ladoC) || ladoB > (ladoA + ladoC) || ladoC > (ladoB + ladoA)){
            System.out.println("Não forma um triângulo, um lado é maior que a soma dos outros 2 lados!");
        }else{
            if(ladoA == ladoB && ladoB == ladoC ){
                System.out.println("Triangulo equilátero, todos lados iguais");
            }else if((ladoA == ladoB && ladoB != ladoC) || (ladoA == ladoC && ladoA != ladoB) ){
                System.out.println("Triangulo Isósceles 2 lados iguais");
            }else if(ladoA != ladoB && ladoB != ladoC && ladoC != ladoA){
                System.out.println("Triangulo Escaleno, 3 lados diferentes");
            }
        }
        entrada.close();
    }
    
}