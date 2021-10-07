package exercicios.exercicios01;

public class ContaCorrente extends Conta{
    final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(int numero){
        super(numero);
    }

    @Override
    public boolean sacar(double valor){
        if(valor <= getSaldo()){ // verifica se tem saldo suficiente
            
            return super.sacar(valor);// chame o sacar da superclasse
        }
        return false; //nao tem saldo
    }

    @Override
    public boolean depositar(double valor){
        return super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public String toString(){
        return  "Conta Corrente: " + super.toString(); 
    }
}
