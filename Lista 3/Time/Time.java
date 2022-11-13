public class Time{
    int hora;
    int min;
    int sec;

    public Time(int hora, int min, int sec){
        this.hora = hora;
        this.min = min;
        this.sec = sec;
    }
    public Time(){
        this.hora = 0;
        this.min = 0;
        this.sec = 0;
    }

    public int getHora(){
        return this.hora;
    }
    public int getMin(){
        return this.min;
    }
    public int getSec(){
        return this.sec;
    }

    public boolean isAm(){
        if(hora<12 && hora>0){
            return true;
        }else{
            return false;
        }
    }

    private boolean validaTime(int hora, int min, int sec){
        if((hora>0 && hora<25) && (min>=0 && min<61) && (sec>=0 && sec<61)){
            return true;
        }else{
            return false;
        }
    }

    public void setTime(int hora, int min, int sec){
        if(validaTime(hora, min, sec)){
            this.hora = hora;
            this.min = min;
            this.sec = sec;
        }else{
            this.hora = 0;
            this.min = 0;
            this.sec = 0;
        }
    }

    public int cron(Time outraHora){
        int horas = mode(outraHora.getHora() - this.hora);
        int minuto = mode(outraHora.getMin() - this.min);
        int segundos = mode(outraHora.getSec() - this.sec);

        return (horas * 3600) + (minuto * 60) + (segundos);
    }
    private int mode(int n){
        if(n < 0){
            return (-1) * n;
        }
        return n;
    }

    public void addSeconds(int secs){
        if(secs < 0){
            System.out.printf("Erro\n");
            System.exit(-1);
        }
        this.sec = this.sec + secs;
        if(this.sec >= 60){
            this.min = this.min + this.sec / 60;
            this.sec = this.sec % 60;
            if(this.min >= 60){
                this.hora = this.hora + this.min / 60;
                this.min = this.min % 60;
                if(this.hora >= 24){
                    this.hora = this.hora % 24;
                }
            }
        }
    }

    public void imprimeTime(){
        String imprime = this.hora + ":" + this.min + ":" + this.sec;
        System.out.printf(""+ imprime+ "\n");
    }

}