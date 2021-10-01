package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Locale l = new Locale("us","US");
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, MEDIA;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        MEDIA = (nota1 * 0.20) + (nota2 * 0.30) + (nota3 * 0.50);
    
        System.out.format(l,"MEDIA = %,.1f",MEDIA);

        entrada.close();
    }
}
