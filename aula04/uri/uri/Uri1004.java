package uri;

import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1, valor2, PROD;

        valor1 = entrada.nextInt();
        valor2 = entrada.nextInt();

        PROD = valor1 * valor2;

        System.out.println("PROD = "+PROD);

        entrada.close();
    }
}
