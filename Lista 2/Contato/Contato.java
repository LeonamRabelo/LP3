import java.util.*;

public class Contato{
    private String nome, email, telefone;
    private int dia, mes, ano;

    public void inicializaContato(){
        this.nome = getNome();
        this.email = getEmail();
        this.telefone = getTelefone();
        this.dia = getDia();
        this.mes = getMes();
        this.ano = getAno();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone(String telefone){
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace("-", "");
        telefone = telefone.replace(" ", "");
        this.telefone = telefone;
    }

    public void setData(int dia, int mes, int ano){
        Data data = new Data();

        data.setData(dia, mes, ano);
        this.dia = data.getDia();
        this.mes = data.getMes();
        this.ano = data.getAno();
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }
    
    public void imprimeContato(){
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Email: %s\n", getEmail());
        System.out.printf("Telefone: %s\n", getTelefone());
        System.out.printf("Nascimento: %02d/%02d/%02d\n", getDia(), getMes(), getAno());
    }
    
    public int calculaIdade(){
        Calendar data = new GregorianCalendar();
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int mes = data.get(Calendar.MONTH);
        int ano = data.get(Calendar.YEAR);
        int idade = ano - this.ano;

        if(this.mes<=mes){
            if(this.dia<=dia){
                return idade;
            }
        }
        return (idade - 1);
    }
}