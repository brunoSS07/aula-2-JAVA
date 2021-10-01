import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAluno, mediaTurma, MediaGeral;
        final int NUM_ALUNO = 3;
        final int NUM_TURMA = 2;
        
        MediaGeral = 0;
        
        for(int t = 1; t <= NUM_TURMA; t++){
            System.out.printf("Turma %d\n", t);
            mediaTurma = 0;
            for(int a = 1;  a <= NUM_ALUNO  ; a++){
                System.out.printf("Media do aluno %dº aluno: ", a);
                mediaAluno = teclado.nextDouble();
                mediaTurma += mediaAluno;
            }

            mediaTurma /= NUM_ALUNO;
            System.out.printf("Média da Turma %dª turma: %.02f\n", t, (mediaTurma));
            MediaGeral += mediaTurma;
        }
        MediaGeral /= NUM_TURMA;
            System.out.printf("Media Geral das turmas é: %.02f\n", MediaGeral);

        teclado.close();

    }
}
