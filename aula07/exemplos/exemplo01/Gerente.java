package exemplos.exemplo01;

public class Gerente extends Funcionario{
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numfuncionmarios){
        //super chama o ciosntrutor da superclasse
        super(nome, salario);
        this.numFuncionarios = numfuncionmarios;
    }

    public Gerente(String nome){
        super(nome, 0);
    }

    //@ é uma indicação
    //@ override indica que o metodo foi sobrescrito
    @Override
        public void exibir(){
            System.out.println(getNome() + " - " + getSalario()+ " - " + numFuncionarios);
        }

    @Override
    public void aumentaSalario(double porcentagem){
       super.aumentaSalario(porcentagem + 20);
    }

   /* @Override
    public String toString(){
        
        return super.getNome() + ": R$ "+ super.getSalario() + "\nNumero de funcionários: "+ numFuncionarios;
    }*/
    @Override
    public String toString(){
        return super.toString() + "\nNumero de funcionario: "+ numFuncionarios;
    }

    
    
}
