package exercicios.exercico04.exercicio05;

public class Relogio1 {
        private int horas, minutos, segundos, milesimo, minisegundos;
        boolean ligar = true;
        
        public Relogio1(){

        }
    
        public Relogio1( int horas, int minutos, int segundos){
            if( horas < 24 && horas >= 0){
                this.horas = horas;
            }
            if( minutos <= 60 && minutos >= 0){
                this.minutos = minutos;
            }
            if( segundos <= 60 && segundos >= 0){
                this.segundos = segundos;
            }
    
        }
    
        public void horaAtual(){
            System.out.println(horas + " : " + minutos + " : " + segundos);
        }
    
        int getHoras(){
            return horas;
        }
    
        int getMinutos(){
            return minutos;
        }
    
        int getSegundos(){
            return segundos;
        }
    
        public void setHoras(int horas){
            if( horas < 24 && horas >= 0){
                this.horas = horas;
            }
        }
    
        public void setMinutos(int minutos){
            if( minutos <= 60 && minutos >= 0){
                this.minutos = minutos;
            }
        }
    
        public void setSegundos(int segundos){
            if( segundos <= 60 && segundos >= 0){
                this.segundos = segundos;
            }
        }
    
        
    
        public void rodarRelogio(){
            while (ligar) {
                minisegundos += 1;
                
                if (minisegundos == 180) {
                    minisegundos = 0;
                    milesimo +=1;
                } 
                if (milesimo == 59) {
                    milesimo = 0;
                    segundos +=1;
                } 
                if (segundos == 59) {
                    minutos +=1;
                    segundos = 0;
                }
                if (minutos == 59) {
                    minutos =0;
                    horas += 1;
                }
                if (horas == 23) {
                    horas = 0;
                    
                }
    
                horaAtual();
                
    
            }
        }
}
