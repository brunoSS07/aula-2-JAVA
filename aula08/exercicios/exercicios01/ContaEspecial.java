package exercicios.exercicios01;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, double limite){
        super(numero);
        this.limite = limite;
    }

        @Override
        public boolean sacar(double valor){
            if(valor > 0){
               return super.sacar(valor);
            }
            return false;
        }

        @Override
        public String toString(){
            return "Conta Especial: " + super.toString() + " Limite: "+ limite;
        }
    
}
