package exercicios.exercicio03;
public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Palio","FIAT",15);
        
        v.apresentar();

        v.setConsumo(13);

        System.out.println("Consumo é: "+ v.getConsumo());
    }
}
