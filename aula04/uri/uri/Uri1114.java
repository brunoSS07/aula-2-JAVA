package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senhaDigitada;
        final String senha = "2002";

        int permissão = 1;
        while(permissão == 1){
            senhaDigitada = entrada.nextLine();
            if(senhaDigitada.equals(senha)){
                System.out.println("Acesso Permitido");
                permissão = 0;
            }else{
                System.out.println("Senha Invalida");
            }
        }

        entrada.close();
    }
}
