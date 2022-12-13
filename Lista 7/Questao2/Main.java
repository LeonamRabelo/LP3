public class Main{
    public static void main(String[] args){
        Ponto3DH ponto1 = new Ponto3D(2, 3, 4);
        Ponto3DH ponto2 = new Ponto3D(1, 2, 3);

        System.out.println(ponto1.toString());
        System.out.println(ponto1.distance(ponto2));
    }
}