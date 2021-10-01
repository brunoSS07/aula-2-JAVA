import java.util.Scanner;

public class Exemplo003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[5];

        for(int i=0; i <5; i++){
            System.out.printf("Posicao %d recebeu o numero %d\n",i, numeros[i]);
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digitou: "+numeros[i]+ " ");
        }

        entrada.close();
    }
}
