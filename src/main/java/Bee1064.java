import java.util.Scanner;

public class Bee1064 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor1 = input.nextDouble();
        double valor2 = input.nextDouble();
        double valor3 = input.nextDouble();
        double valor4 = input.nextDouble();
        double valor5 = input.nextDouble();
        double valor6 = input.nextDouble();

        int positivos = 0;
        double soma = 0;

        if (valor1 > 0) {
            positivos++;
            soma = soma + valor1;
        }
        if (valor2 > 0) {
            positivos++;
            soma = soma + valor2;
        }
        if (valor3 > 0) {
            positivos++;
            soma = soma + valor3;
        }
        if (valor4 > 0) {
            positivos++;
            soma = soma + valor4;
        }
        if (valor5 > 0) {
            positivos++;
            soma = soma + valor5;
        }
        if (valor6 > 0) {
            positivos++;
            soma = soma + valor6;
        }

        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f%n" , (soma / positivos));

        input.close();

    }
}
