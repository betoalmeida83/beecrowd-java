import java.util.Scanner;

public class Bee1018 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int nota100 = N / 100;
        int nota50 = (N % 100) / 50;
        int nota20 = ((N % 100) % 50) / 20;
        int nota10 = (((N % 100) % 50) % 20) / 10;
        int nota5 = ((((N % 100) % 50) % 20) % 10) / 5;
        int nota2 = (((((N % 100) % 50) % 20) % 10) % 5) / 2;
        int nota1 = ((((((N % 100) % 50) % 20) % 10) % 5) % 2);

        System.out.println(N);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        input.close();

    }
}
