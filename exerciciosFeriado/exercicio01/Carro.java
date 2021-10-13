package exercicio01;


public class Carro {
private String marca;
private String modelo;
private double combustivel;
private double consumoMedio; 
private double quilometragem;

/* CM = consumo médio;
   S = distância percorrida em quilômetros;
   v = quantidade de combustível utilizada em litros.
   Formula = CM = S / V
*/

public Carro(String marca,String modelo, double combustivel, double consumoMedio, double quilometragem) {
    this.marca = marca;
    this.modelo = modelo;
    this.combustivel = combustivel;
    this.consumoMedio = consumoMedio;
    this.quilometragem = quilometragem;
}

public Carro(String marca,String modelo, double consumoMedio) {
    this.marca = marca;
    this.modelo = modelo;
    this.consumoMedio = consumoMedio;
}

public void andar(double quilometragem){
    if(quilometragem > 0){
        
        if(((quilometragem / this.consumoMedio) <= this.combustivel)){
            this.quilometragem += quilometragem;
            this.combustivel -= (quilometragem / this.consumoMedio);
        }else{
            System.out.println("Combustivel insuficiente");
        }
    }else{
        System.out.println("[ERRO]Precisa da quilometragem pra prosseguir!");
    }
}

public void abastecer(double combustivel){
    if(combustivel > 0){
        this.combustivel += combustivel;
    }else{
        System.out.println("[ERRO]Adicione um valor de combustivel");
    }
}

@Override
public String toString(){
    return String.format("Marca: %s\nModelo: %s\nCombustivel: %.2f\nConsumo por KM/1L: %.02f KM\nDistancia percorrida: %.0f KM\n", this.marca, this.modelo, this.combustivel, this.consumoMedio, this.quilometragem);
}

    
}