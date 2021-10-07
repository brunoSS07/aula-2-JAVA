package exercicios.exercicio02;

public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, int anoNascimento, Proprietario proprietario){
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = proprietario;
    }

    public Animal(String nome, String raca, int anoNascimento, String nomeProprietario, String telefone){
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario(nomeProprietario, telefone);
    }

    public String toString(){
        return nome + " - " + raca + " - " + anoNascimento + " - " + proprietario;
    }
}
