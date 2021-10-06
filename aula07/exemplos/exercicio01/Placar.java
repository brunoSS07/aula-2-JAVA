package exemplos.exercicio01;

public class Placar {
    String timeCasa, timeVisitante;
    int golsCasa, golsVisitante;

    //p
    public Placar(){
        timeCasa = "Time da casa";
        timeVisitante = "Time visitante";
        //this("time da Casa", "time visitante", 0, 0); 
    }

    //p2
    public Placar(String timeCasa, String timeVisitante){
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        //segunda maneira de atribuir valores
        //this(timeCasa, timeVisitante, 0, 0); 
    }

    //p3
    public Placar(String timeCasa, String timeVisitante, int golsCasa, int golsVisitante){
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsCasa = golsCasa;
        this.golsVisitante = golsVisitante;
    }

    //exibirá o resultado no objeto ao instanciar no AppPlacar
    public String toString(){
        return timeCasa + " " + golsCasa + " x " + golsVisitante + " " + timeVisitante; 
    }

}
