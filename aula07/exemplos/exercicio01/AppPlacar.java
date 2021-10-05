package exemplos.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p = new Placar();
        Placar p2 = new Placar("Palmeiras","Flamengo");
        Placar p3 = new Placar("Palmeiras","Flamengo",3,0);

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }
}
