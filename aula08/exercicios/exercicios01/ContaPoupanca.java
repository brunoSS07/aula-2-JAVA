package exercicios.exercicios01;

public class ContaPoupanca extends Conta{
    private static double taxa = 0.1;

    ContaPoupanca(int numero) {
        super(numero);
    }

    public static void setTaxa(double novaTaxa) {
        if(novaTaxa > 0) {
            taxa = novaTaxa;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if(valor + taxa <= getSaldo() ) { // verifica se tem saldo suficiente
            return super.sacar(valor + taxa); // chame o sacar da superclasse
        }
        return false; // não tem saldo suficiente
    }

    @Override
    public String toString() {
        return "Conta poupança: " + super.toString() + " taxa: " + taxa;
    }
}
