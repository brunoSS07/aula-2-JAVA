import java.util.Scanner;


public class Exercicio004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double []notaAlunos = new double[5];
        double mediaTurma;
        int qtdAcimaMedia;

        mediaTurma = 0;
        for(int i =0; i < notaAlunos.length; i++){
            System.out.println("digite a nota do aluno "+ i+1);
            notaAlunos[i] = entrada.nextDouble();
            mediaTurma += notaAlunos[i];
        }
        mediaTurma /= notaAlunos.length;

        System.out.println("Notas digitadas:" );
        for(int i =0; i < notaAlunos.length; i++){
            System.out.println("Notas: " + notaAlunos[i]+ " ");
            
        }   
        System.out.println("Media da Turma: "+ mediaTurma);
        

        System.out.println("Quantidade de notas acima da média:");
        qtdAcimaMedia = 0;
        for(int i =0; i < notaAlunos.length; i++){
            if(notaAlunos[i] > mediaTurma ){
                System.out.println(notaAlunos[i]+ " ");
                qtdAcimaMedia++;
            }
            
        }  


        System.out.println("Quantidade de notas acima da media: "+ qtdAcimaMedia);
        entrada.close();
    }
}
