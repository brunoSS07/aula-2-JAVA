package exercicios.exercico04;

public class Relogio {
    private int hora, minuto, segundo;
    
    public Relogio(int hora, int minuto, int segundo){
        setHora(hora); //validar hora pra atribuicao
        setMinuto(minuto);
        setSegundo(segundo);
    }

    
//HORA
    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }
    }

    //MINUTO
    public int getMinuto(){
        return minuto;
    }

    public void setMinuto(int minuto){
        if(minuto >= 0 && minuto < 60){
            this.minuto = minuto;
        }
    }

//SEGUNDO
    public int getSegundo(){
        return segundo;
    }

    public void setSegundo(int segundo){
        if(segundo >= 0 && segundo <60){
            this.segundo = segundo;
        }
    }

    public void exibir(){
        System.out.printf("%02d:%02d:%02d\n",hora,minuto, segundo);
    }

    public String horaAtual(){
        return hora+":"+minuto+":"+segundo;
    }
}
