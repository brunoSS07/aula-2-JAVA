package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        try{
        System.out.println("Digite um numero");
        //numero = scan.nextInt();
        numero = Integer.parseInt(scan.nextLine());
        System.out.println("Voicê digitou o numero: " + numero);
        }catch(InputMismatchException ex){
            System.out.println("Erro ao digitar");
        }catch(NumberFormatException ex){
            System.out.println("Erro ao digitar");
        } finally{
            System.out.println("Fim do programa!");

        scan.close();
        }
        
        
    }
    
   
}