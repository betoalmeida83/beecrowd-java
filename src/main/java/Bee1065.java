import java.util.Scanner;

public class Bee1065 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        int valor4 = input.nextInt();
        int valor5 = input.nextInt();

        int numeroPar = 0;

        if (valor1 % 2 == 0) {
            numeroPar++;
        }
        if (valor2 % 2 == 0) {
            numeroPar++;
        }
        if (valor3 % 2 == 0) {
            numeroPar++;
        }
        if (valor4 % 2 == 0) {
            numeroPar++;
        }
        if (valor5 % 2 == 0) {
            numeroPar++;
        }

        System.out.println(numeroPar + " valores pares");

        input.close();

    }
}
