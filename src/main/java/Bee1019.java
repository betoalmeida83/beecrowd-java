import java.util.Scanner;

public class Bee1019 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int horas = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = (N % 3600) % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        input.close();

    }
}
