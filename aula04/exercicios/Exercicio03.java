import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroMax, cont;
        cont = 1;

        System.out.println("total de Reptições:");
        numeroMax = entrada.nextInt();

        while(cont <= numeroMax){
            cont = cont * 2;
            if(cont <= numeroMax){
                System.out.print(cont + ", ");
            }else{
                System.out.print(cont);
            }
        }

        entrada.close();
    }
}
