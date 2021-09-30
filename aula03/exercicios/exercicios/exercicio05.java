package exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        String senha = "R10p5";
        String senhaDigitada;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digitwe sua senha: ");
        senhaDigitada = entrada.nextLine();

        if(senhaDigitada.equals(senha)){
            System.out.println("Senha correta, acesso liberado.");
        } else {
            System.out.println("Senha incorreta, acesso negado.");
        }

        entrada.close();
    }
}
