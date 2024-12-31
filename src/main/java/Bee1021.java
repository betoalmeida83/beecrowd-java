import java.util.Scanner;

public class Bee1021 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double N = input.nextDouble();
        int resultado;

        System.out.println("NOTAS:");
        resultado = (int) N / 100;
        System.out.println(resultado + " nota(s) de R$ 100.00");
        N = N % 100;
        resultado = (int) N / 50;
        System.out.println(resultado + " nota(s) de R$ 50.00");
        N = N % 50;
        resultado = (int) N / 20;
        System.out.println(resultado + " nota(s) de R$ 20.00");
        N = N % 20;
        resultado = (int) N / 10;
        System.out.println(resultado + " nota(s) de R$ 10.00");
        N = N % 10;
        resultado = (int) N / 5;
        System.out.println(resultado + " nota(s) de R$ 5.00");
        N = N % 5;
        resultado = (int) N / 2;
        System.out.println(resultado + " nota(s) de R$ 2.00");
        N = N % 2;

        System.out.println("MOEDAS:");
        resultado = (int) N / 1;
        System.out.println(resultado + " moeda(s) de R$ 1.00");
        N = N % 1;
        resultado = (int) (N / 0.50);
        System.out.println(resultado + " moeda(s) de R$ 0.50");
        N = N % 0.50;
        resultado = (int) (N / 0.25);
        System.out.println(resultado + " moeda(s) de R$ 0.25");
        N = N % 0.25;
        resultado = (int) (N / 0.10);
        System.out.println(resultado + " moeda(s) de R$ 0.10");
        N = N % 0.10;
        resultado = (int) (N / 0.05);
        System.out.println(resultado + " moeda(s) de R$ 0.05");
        N = N % 0.05;
        resultado = (int) (N / 0.01);
        System.out.println(resultado + " moeda(s) de R$ 0.01");

        input.close();

    }
}
