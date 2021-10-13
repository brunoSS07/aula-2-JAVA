package exercicio01;

public class AppCarro {
    public static void main(String[] args) {
        Carro c = new Carro("FIAT", "PALIO", 2, 10, 30);
        c.abastecer(1);
        c.andar(80);

        System.out.println(c);


    }
}
