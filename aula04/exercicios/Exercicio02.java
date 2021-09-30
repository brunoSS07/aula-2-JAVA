import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numTab, cont;
        cont = 0;

        System.out.println("Tabuada do numero: ");
         numTab = entrada.nextInt();

         while (cont <= 10){
             //System.out.println(numTab + " x " + cont + " = " + (numTab * cont));
             System.out.printf("%d x %02d = %02d\n", numTab, cont, numTab * cont);
            cont++;
         }

         entrada.close();

    }
}
