package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {
    public static void main(String[] args) {
        linha();
        System.out.println("Meu Programa v.1");
         linha();
         System.out.println("Opções");
         int tamanho = "Opções".length(); //conta o comprimento da palavra
         linha2(tamanho);

         linha3(10, '*');
    }

    static void linha() {
        System.out.println("-----------------");
    }

    static void linha2(int tam) {
        for(int i = 0 ; i < tam; i++){
        System.out.print("-");
        }
        System.out.println("");
    }

    static void linha3(int tam, char letra) {
        for(int i = 0 ; i < tam; i++){
        System.out.print(letra);
        }
        System.out.println("");
    }
    
}