import java.util.Scanner;

public class Exemplo001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, chances;

        /* numero = -1;
        while(numero < 0){
            System.out.println("Digite um numero positivo: ");
            numero = teclado.nextInt();
        } */

        chances = 3;
        do{
            System.out.println("Digite um numero positivo: ");
            numero = teclado.nextInt();
            chances--;
        } while(numero < 0 && chances > 0);

        teclado.close();
    }
    
}