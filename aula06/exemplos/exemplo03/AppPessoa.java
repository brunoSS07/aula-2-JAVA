package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Bruno",30);// passei os valores direto
        Pessoa p2 = new Pessoa("Maria",29);

        //p.nome = "Bruno";
        //p.idade = 30;
        p.apresentar();

        //p2.nome = "Maria";
        //p2.idade = 29;
        p2.apresentar();

    }
}
