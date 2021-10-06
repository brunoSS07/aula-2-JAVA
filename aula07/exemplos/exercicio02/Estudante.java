package exemplos.exercicio02;

public class Estudante extends Pessoa{
    String curso;

    public Estudante(String nome, String telefone, String curso){
        //puxo os atributos da minha SUPERCLASSE "PESSOA"
        super(nome, telefone);
        this.curso = curso;
    }

    @Override
    public String toString(){
        return super.toString() + " - " + "Curso: " + curso;
    }
}
