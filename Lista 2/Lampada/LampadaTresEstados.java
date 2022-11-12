public class LampadaTresEstados{
    private int estado;

    public void apagada(){
        this.estado = 0;
    }
    public void acesa(){
        this.estado = 1;
    }
    public void meiaLuz(){
        this.estado = 2;
    }

    public void imprimeEstado(){
        if(estado==0){
            System.out.printf("Lampada apagada.");
        }else if(estado==1){
            System.out.printf("Lampada acesa.");
        }else{
            System.out.printf("Lampada meia-luz.");
        }
    }
}