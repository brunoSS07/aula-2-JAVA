package exemplos.exercicio02;
//Uma classe abstract não pode gerar objetos
public class AppPessoa {
    public static void main(String[] args) {
       // Pessoa p = new Pessoa("Bruno", "11 9999-9999");
        Estudante estu = new Estudante("Maria", "11 53535-3646", "Analise de Sitemas");
        Professor prof = new Professor("José", "11 53535-3646", 3000);

        //System.out.println(p);
        System.out.println(estu);
        System.out.println(prof);
    }
}
