package exemplos.exemplo03;
//MODELO
public class Pessoa {
    //atributos
    String nome;
    int idade;

    //Metodo construtor - inicializar os dados do objeto
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    //metodos
    void apresentar(){
        System.out.println("Olá! sou " + nome);
    }
}
