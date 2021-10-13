package exercicios.exercicios01.dominio;

public abstract class Conta {
    private int numero;
    private double saldo;

    // Metodo CONSTRUTOR
    public Conta(int numero){
        this.numero = numero;
        this.saldo = 0;
    }
    // Metodo CONSTRUTOR
    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
        saldo = saldo + valor;
        return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if(valor > 0){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%d : R$ %.2f", numero, saldo); 
    }

}