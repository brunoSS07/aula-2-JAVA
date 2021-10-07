package exemplos.exemplo01;

public class Endereco {
    private String logradouro;
    int numero;

    public Endereco(String logradouro, int numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public void exibir() {
        System.out.println(logradouro + ", " + numero);
    }
}
