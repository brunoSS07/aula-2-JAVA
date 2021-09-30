package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        
        String nome = "Bruno";

        //if(nome.equals("bruno")){
            if(nome.equalsIgnoreCase("bruno")){ // ignora o case sensitive
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }

    }
}
