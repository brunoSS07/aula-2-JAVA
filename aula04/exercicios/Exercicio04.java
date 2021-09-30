import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAcum,  valor, cont;
        numAcum = 0;
        
        valor = 1;
        cont = 1;
        while(valor > 0){
            
            System.out.printf("Digite o %dº numero (0 = FIM): ", cont);
            valor = entrada.nextInt();
            numAcum += valor;
            cont++;

        }
        System.out.println("A soma dos valores digitado é: "+ numAcum);
        entrada.close();
    }
}
