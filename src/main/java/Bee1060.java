import java.util.Scanner;

public class Bee1060 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor1 = input.nextDouble();
        double valor2 = input.nextDouble();
        double valor3 = input.nextDouble();
        double valor4 = input.nextDouble();
        double valor5 = input.nextDouble();
        double valor6 = input.nextDouble();

        int positivos = 0;

        if (valor1 > 0) {
            positivos++;
        }
        if (valor2 > 0) {
            positivos++;
        }
        if (valor3 > 0) {
            positivos++;
        }
        if (valor4 > 0) {
            positivos++;
        }
        if (valor5 > 0) {
            positivos++;
        }
        if (valor6 > 0) {
            positivos++;
        }

        System.out.println(positivos + " valores positivos");

        input.close();

    }
}
