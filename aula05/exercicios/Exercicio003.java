import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args, String string) {
        Scanner teclado = new Scanner(System.in);
        int i;
        String [] nomes = new String[3];

        i = 0;
        System.out.println(string);
        for(i = 0; i < nomes.length; i++){
            nomes[i] = teclado.nextLine();
        }
        System.out.println("======================");
        System.out.println("Nomes na ordem original: ");
        for(i = 0; i < nomes.length; i++){
            System.out.print(nomes[i] + " ");
        }
        System.out.println("\n======================");
        System.out.print("Nomes na ordem inversa: \n");
        for(i = nomes.length -1; i >= 0; i--){
            System.out.print(nomes[i]+ " ");
        }

        teclado.close();
    }
}
