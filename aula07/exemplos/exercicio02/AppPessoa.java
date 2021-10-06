package exemplos.exercicio02;
//Uma classe abstract não pode gerar objetos
public class AppPessoa {
    public static void main(String[] args) {
       // Pessoa pessoa = new Pessoa("Bruno", "11 9999-9999");
        Estudante e = new Estudante("Maria", "11 53535-3646", "Analise de Sitemas");
        Professor p = new Professor("José", "11 53535-3646", 3000);

        //System.out.println(p);
        System.out.println(e);
        System.out.println(p);

        // Por meio da herança e da aplicação de polimorfismo podemos fazer isso:
        // criar um vetor do tipo da classe base e todos os "filhos" que herdam da classe base
        // podem ser colocados no mesmo vetor.
        System.out.println("======================================================");
        Pessoa[] vetor = new Pessoa[3];

        vetor[0] = new Estudante("José", "9999999", "Gastronomia");
        vetor[1] = new Estudante("Marcos", "111111", "Gastronomia");
        vetor[2] = new Professor("Marcelo", "22222", 1000);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
