package exemplos.exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario fun = new Funcionario("Bruno", 1000);
        //cosntrutor com 3 parametros
        Gerente ger = new Gerente("Maria", 2000,10);
        //cosntrutor com 1 paramtro
        Gerente ger2 = new Gerente("João");

        fun.aumentaSalario(10);
        fun.exibir();
        ger.aumentaSalario(20);
        ger.exibir();
        ger2.exibir();

        System.out.println(fun);
        System.out.println(ger);

        
    }
}
