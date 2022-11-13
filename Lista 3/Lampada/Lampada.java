public class Lampada{
    private String cor = new String();
    private double voltagem;
    private double valor;
    private double potencia;

    public Lampada(String cor, double voltagem, double valor, double potencia){
        this.cor = cor;
        setVoltagem(voltagem);
        this.voltagem = voltagem;
        setValor(valor);
        this.valor = valor;
        setPotencia(potencia);
        this.potencia = potencia;
    }
    public Lampada(){
        this.cor = null;
        this.voltagem = 0;
        this.valor = 0;
        this.potencia = 0;
    }

    //Retorna a potencia
    public double getPotencia(){
        return this.potencia;
    }

    //Retorna a cor
    public String getCor(){
        return this.cor;
    }

    //Retorna voltagem
    public double getVoltagem(){
        return this.voltagem;
    }

    //Retorna o valor
    public double getValor(){
        return this.valor;
    }

    //Define a potencia
    public void setPotencia(double potencia){
        if(potencia < 0){
            System.out.printf("Erro de potencia.\n");
            System.exit(-1);
        }
        this.potencia = potencia;
    }

    //Define a cor
    public void setCor(String cor){
        this.cor = cor;
    }

    //Define a voltagem
    public void setVoltagem(double voltagem){
        if(voltagem < 0){
            System.out.printf("Erro de voltagem.\n");
            System.exit(-1);
        }
        this.voltagem = voltagem;
    }

    //Define o valor
    public void setValor(double valor){
        if(valor < 0){
            System.out.printf("Erro no valor.\n");
            System.exit(-1);
        }
        this.valor = valor;
    }

    //Imprime as informações
    public void imprimeDados(){
        System.out.printf("Cor: %s\n", getCor());
        System.out.printf("Potencia: %f\n", getPotencia());
        System.out.printf("Voltagem: %f\n", getVoltagem());
        System.out.printf("Valor unitário: %f\n", getValor());
    }
}