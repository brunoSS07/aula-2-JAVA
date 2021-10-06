package exemplos.exercicio02;

//uma classe abstract não pode instanciar objetos, ela serve somente como modelo
public abstract class Pessoa {
    private String nome;
    private String telefone;


    public Pessoa(){

    }

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        
    }

    public String toString(){
        return "Nome: "+ nome + " - " + "Telefone: " + telefone ;
    }
}
