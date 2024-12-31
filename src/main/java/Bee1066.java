import java.util.Scanner;

public class Bee1066 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        int valor4 = input.nextInt();
        int valor5 = input.nextInt();

        int numeroPar = 0;
        int numeroImpar = 0;
        int numeroPositivo = 0;
        int numeroNegativo = 0;

        if (valor1 % 2 == 0) {
            numeroPar++;
        }
        if (valor1 % 2 != 0) {
            numeroImpar++;
        }
        if (valor1 > 0) {
            numeroPositivo++;
        }
        if (valor1 < 0) {
            numeroNegativo++;
        }

        if (valor2 % 2 == 0) {
            numeroPar++;
        }
        if (valor2 % 2 != 0) {
            numeroImpar++;
        }
        if (valor2 > 0) {
            numeroPositivo++;
        }
        if (valor2 < 0) {
            numeroNegativo++;
        }

        if (valor3 % 2 == 0) {
            numeroPar++;
        }
        if (valor3 % 2 != 0) {
            numeroImpar++;
        }
        if (valor3 > 0) {
            numeroPositivo++;
        }
        if (valor3 < 0) {
            numeroNegativo++;
        }

        if (valor4 % 2 == 0) {
            numeroPar++;
        }
        if (valor4 % 2 != 0) {
            numeroImpar++;
        }
        if (valor4 > 0) {
            numeroPositivo++;
        }
        if (valor4 < 0) {
            numeroNegativo++;
        }

        if (valor5 % 2 == 0) {
            numeroPar++;
        }
        if (valor5 % 2 != 0) {
            numeroImpar++;
        }
        if (valor5 > 0) {
            numeroPositivo++;
        }
        if (valor5 < 0) {
            numeroNegativo++;
        }

        System.out.println(numeroPar + " valor(es) par(es)");
        System.out.println(numeroImpar + " valor(es) impar(es)");
        System.out.println(numeroPositivo + " valor(es) positivo(s)");
        System.out.println(numeroNegativo + " valor(es) negativo(s)");

        input.close();

    }
}
