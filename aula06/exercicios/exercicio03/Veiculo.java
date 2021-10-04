package exercicios.exercicio03;

public class Veiculo {
    String modelo;
    String marca;
    private double consumo; // km/l

    Veiculo(String modelo, String marca, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public void apresentar(){
        System.out.println("Modelo do carro é: "+ modelo);
        System.out.println("Marca do carro é: "+ marca);
    }

    public double consumoCarro(){
        return consumo;
    }

    public double getConsumo(){
        return consumo;
    }

    public void setConsumo(double novoConsumo){
        if(novoConsumo > 0){
        consumo = novoConsumo;
        }
    }

}
