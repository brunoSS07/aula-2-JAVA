package exercicios.exercico04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio rel = new Relogio(16, 40, 55);

    System.out.println("Hora atual é: " + rel.getHora());

    rel.setHora(-70);
    System.out.println("Hora atual é: " + rel.getHora());
    }
}
