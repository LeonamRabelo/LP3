public class Main{
    public static void main(String[]args){
        Contato contato = new Contato();

        contato.setData(26, 9, 2002);
        contato.setEmail("lion@gmail.com");
        contato.setTelefone("08080000");
        contato.setNome("Lion");
        contato.imprimeContato();
        System.out.println("Idade = " + contato.calculaIdade());
    }
}