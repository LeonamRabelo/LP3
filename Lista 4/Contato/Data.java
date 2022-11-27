public class Data{
    private int dia, mes, ano;
    
    ///setters e getters
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }

    public void setData(int dia, int mes, int ano){
        if(verificaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.printf("Data inválida.");
            System.exit(-1);
        }
    }

    ///inicializar padrao
    public void inicializa(){
    this.dia = getDia();
    this.mes = getAno();
    this.ano = getAno();
    }

    ///verificar data
    public boolean verificaData(int dia, int mes, int ano){
    if((mes>=1)&&(mes<=12)){
        if(mes==2){
            if((dia>=1) && (dia<=29)){
                return true;
            }else if((dia>=1) && (dia<=28)){
                return true;
            }
            return false;
            }else if((dia>=1) && (dia<=30) && ((mes%2==0) && (mes!=8))){
            return true;
            }else if((dia>=1) && (dia<=31)){
            return true;
            }
    }
    return false;
        }
    
    public void imprimeData(){
        System.out.printf("%d/%d/%d", dia, mes, ano);
    }

    public void imprimeDataExtenso(){
        String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.printf("%d de %s de %d.\n", this.dia, m[getMes()-1], this.ano);
    }

}
