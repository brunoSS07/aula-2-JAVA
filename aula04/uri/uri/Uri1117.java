package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
        boolean notaValida = false;
        nota1 = 0;
        nota2 = 0;
        media = 0;

        notaValida = false;
        while(notaValida == false){
            nota1 = entrada.nextDouble();
            if(nota1 < 0 || nota1 > 10){
                System.out.println("nota invalida");
            }else{
                notaValida = true;
            }
        }
        
        notaValida = false;
        while(notaValida == false){
            nota2 = entrada.nextDouble();
            if(nota2 < 0 || nota2 > 10){
                System.out.println("nota invalida");
            }else{
                notaValida = true;
            }
        }
        media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f\n", media);

        entrada.close();
    }
}
