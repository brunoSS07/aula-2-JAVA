package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double valor;
        valor = entrada.nextDouble();

        if(valor < 0 || valor > 100){
            System.out.println("Fora de intervalo");
        }else if((valor >= 0) && (valor <= 25)){
            System.out.println("Intervalo [0,25]");
        }else if((valor > 25) && (valor <= 50)){
            System.out.println("Intervalo (25,50]");
        }else if((valor > 75) && (valor <= 100)){
                System.out.println("Intervalo (75,100]");
        }
        entrada.close();
    }
}
