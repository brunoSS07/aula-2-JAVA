package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
    
    //public boolean ativar(int p){
    //    return p > 1;
    //}

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        //System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

       //Exemplo02 e = new Exemplo02();

       //System.out.println(e.ativar( 1));
        
    }
}
