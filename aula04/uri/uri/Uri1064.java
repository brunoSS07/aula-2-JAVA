package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double []valores = new double[6];
        int pos=0;

        double media =0;


        for (int i = 0; i < valores.length; i++) {
            valores[i] = entrada.nextDouble();
            if(valores[i] >=0){
                pos +=1;
                media += valores[i];
            }
        }
        media = media /= pos;

        System.out.printf("%d valores positivos\n", pos );
        System.out.printf("%.1f\n",media);


        entrada.close();
    }
}
