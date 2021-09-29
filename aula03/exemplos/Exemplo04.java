package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int n1,n2;
        String nome = "Bruno";

        //if(nome.equals("bruno")){
            if(nome.equalsIgnoreCase("bruno")){ // ignora o case sensitive
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }

    }
}
