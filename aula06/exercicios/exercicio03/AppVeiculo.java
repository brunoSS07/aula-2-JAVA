package exercicios.exercicio03;

import javax.swing.JOptionPane;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Palio","FIAT",15);
        

        v.apresentar();

        v.alterarConsumo(10);

        System.out.println("Consumo é:"+ v.consumoCarro());
    }
}
