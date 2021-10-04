package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int retorno;
        retorno =  soma(5, 6); //recebe o retorno do metodo
       System.out.println("Resultado: " + retorno);
    }

    //recebe 2 parametro inteiroe e retorna um int
    static int soma(int n1, int n2) {
        int resultado = n1 + n2;

        return resultado; //devolve o tipo declarado do metodo
    }
}
