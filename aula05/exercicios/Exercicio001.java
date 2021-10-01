import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, maior, menor, pos;

        maior = Integer.MIN_VALUE; // o menor inteiro possivel
        menor = Integer.MAX_VALUE; // o maior inteiro possivel
        System.out.println("Maior valor: " + maior + "; Menor valor: " + menor);

        System.out.println("Digite 10 numeros");
        System.out.println("=================");
        for (pos = 1; pos < 11; pos++) {
            System.out.printf("Digite o %dº numero: ", pos);
            num = teclado.nextInt();
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);

        teclado.close();
    }
}
