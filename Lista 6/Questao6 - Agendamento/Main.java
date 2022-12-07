public class Main{
    public static void main(String[] args){
        Agendamento[] dentista = new Agendamento[2];
        dentista[0] = new Agendamento(27, 11, 2022, 10, 15, 45, "Lion", "lion@gmail.com", "0863888822", 25, 10, 2001);
        dentista[1] = new Agendamento(29, 1, 2023, 13, 0, 0, "Catinho", "catinho@gmail.com", "93839232", 5, 5, 2005);

        System.out.println(dentista[0].toString());
        System.out.println(dentista[1].toString());
    }
}