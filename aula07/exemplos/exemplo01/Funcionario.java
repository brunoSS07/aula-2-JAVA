package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    //metodo Construtor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibir(){
        System.out.println(nome + " - " + salario);
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }
    
    public void aumentaSalario(double porcentagem){
        salario = salario + (salario * (porcentagem / 100));
    }

    @Override
    public String toString(){
        return nome + ": R$ "+ salario;
    }
}