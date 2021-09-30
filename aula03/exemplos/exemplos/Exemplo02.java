package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.println("Digite um número inteiro: ");
        valor = entrada.nextInt();

        if(valor >= 0){
            System.out.println("Número Positivo");
        }else{
            System.out.println("Número Negativo");
        }

        entrada.close();
    }
}
