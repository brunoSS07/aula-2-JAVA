package exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestacao;

        System.out.println("Salário bruto: ");
        salarioBruto = entrada.nextDouble();
        System.out.println("Valor da prestação: ");
        prestacao = entrada.nextDouble();

        if(prestacao > (salarioBruto * 0.30) ){
            System.out.printf("Valor de %.2f passou do valor máximo de %.2f que poderá ser concedido pra você.", prestacao, salarioBruto * 0.30 );
        }else{
            System.out.printf("O valor de %.2f poderá ser concedido.", prestacao);
        }

        entrada.close();
    }
}
