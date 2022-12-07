public class Agendamento{
    private Hora hora;
    private Data data;
    private Contato contato;

    public Agendamento(int dia, int mes, int ano, int hora, int minuto, int segundo, String nome, String email, String telefone, int nDia, int nMes, int nAno){
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hora, minuto, segundo);
        this.contato = new Contato(nome, email, telefone, nDia, nMes, nAno);
    }

    public boolean isEqualHora(Hora outraHora){
        if((outraHora.getHora() == hora.getHora()) && (outraHora.getMinuto() == hora.getMinuto()) && (outraHora.getSegundo() == hora.getSegundo())){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Agendamento\n\n" + "Data: " + data.toString() + "Hora: " + hora.toString() + "Contato: " + contato.toString();
    }
}