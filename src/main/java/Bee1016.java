import java.util.Scanner;

public class Bee1016 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();

        int tempo = (distancia * 60) / 30;

        System.out.println(tempo + " minutos");

        input.close();

    }
}
