package exercicios.exercicio02;

public class AppAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Brian", "Pitbull", 2008, "Bruno", "11 99999-9999");

        Proprietario p = new Proprietario("BrunoSS07", "xxxxx-xxxx");

        Animal animal2 = new Animal("Brian", "Rotivailer", 2010, p);

        System.out.println(animal);
        System.out.println(animal2);
    }
}
