package exemplos.exemplo01;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
        endereco = new Endereco("Endereço não cadastrado", 0);
    }

    public Pessoa(String nome, String logradouro, int numero) {
        this.nome = nome;
        endereco = new Endereco(logradouro, numero);
    }

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void exibir() {
        System.out.print(nome);
        // System.out.println(endereco);
        // if(endereco != null){
        endereco.exibir();
        // }
    }
}
