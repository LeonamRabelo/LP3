public class Main{
    public static void main(String[] args){
        Ponto2D ponto = new Ponto2D(1, 0);

        System.out.println(ponto.isEixoX());
        System.out.println(ponto.isEixoY());
        System.out.println(ponto.isEixos());
        System.out.println(ponto.quadrante());
        System.out.println(ponto.distancia(ponto));
    }
}