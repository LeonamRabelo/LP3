public class DataHora{
    private Data data;
    private Hora hora;

    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo){
        data = new Data(dia, mes, ano);
        hora = new Hora(hora, minuto, segundo);
    }

    public int getDia(){
        return data.getDia();
    }

    public int getMes(){
        return data.getMes();
    }

    public int getAno(){
        return data.getAno();
    }

    public int getHora(){
        return hora.getHora();
    }

    public int getMinuto(){
        return hora.getMinuto();
    }

    public int getSegundo(){
        return hora.getSegundo();
    }

    public String toString(){
        return data.toStringLong() + ", " + hora.toString();
    }

    public boolean isEqual(DataHora outroObjeto){
        if((outroObjeto.getDia() == getDia()) && (outroObjeto.getMes() == getMes()) && (outroObjeto.getAno() == getAno())){
            if((outroObjeto.getHora() == getHora())  && (outroObjeto.getMinuto() == getMinuto()) && (outroObjeto.getSegundo() == getSegundo())){
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isGreather(DataHora outroObjeto){
        if(!data.isPrevious(outroObjeto.getDia(), outroObjeto.getMes(), outroObjeto.getAno())){
            if(outroObjeto.getHora() > hora.getHora()){
                return true;
            }else if(outroObjeto.getHora() < hora.getHora()){
                return false;
            }else{
                if(outroObjeto.getMinuto() > hora.getMinuto()){
                    return true;
                }else if(outroObjeto.getMinuto() < hora.getMinuto()){
                    return false;
                }else{
                    if(outroObjeto.getSegundo() > hora.getSegundo()){
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public boolean isLower(DataHora outroObjeto){
        if(isGreather(outroObjeto)){
            return false;
        }
        return true;
    }
}