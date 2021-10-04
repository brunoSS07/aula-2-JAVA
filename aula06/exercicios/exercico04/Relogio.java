package exercicios.exercico04;

public class Relogio {
    private int hora, minuto, segundo;
    
    public Relogio(int hora, int minuto, int segundo){
        setHora(hora); //só vai receber a hora se respeitar minha condição.
        this.minuto = minuto;
        this.segundo = segundo;
    }

    

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }
    }
}
