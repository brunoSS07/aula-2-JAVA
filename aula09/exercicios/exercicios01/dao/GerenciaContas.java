package exercicios.exercicios01.dao;

import java.util.ArrayList;

import exercicios.exercicios01.dominio.Conta;
import exercicios.exercicios01.dominio.ContaCorrente;
import exercicios.exercicios01.dominio.ContaEspecial;
import exercicios.exercicios01.dominio.ContaPoupanca;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas(){
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta){
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta){
        contas.add(new ContaPoupanca(numeroConta));
    }

   

    public boolean depositar(int numeroConta, double valor){
        // procura a conta para realizar o depósito
        for(Conta conta : contas){
            if(conta.getNumero() == numeroConta){ // achou a conta
                return conta.depositar(valor);
            }
        }
        return false; // conta não encontrada
    }

    public boolean sacar(int numeroConta, double valor){
        for(Conta conta : contas){
            if(conta.getNumero() == numeroConta){ // achou a conta
                return conta.sacar(valor);
            }
        }
        return false; // conta não encontrada
    }

    public String saldo(int numeroConta) {
        for (Conta conta : contas) {
            if(conta.getNumero() == numeroConta) {
                // return conta.toString();
                return "" + conta;
            }
        }
        return "Conta não encontrada.";
    }

}
