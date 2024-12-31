import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codPeca1 = input.nextInt();
        int qtdPeca1 = input.nextInt();
        double valorPeca1 = input.nextDouble();
        int codPeca2 = input.nextInt();
        int qtdPeca2 = input.nextInt();
        double valorPeca2 = input.nextDouble();

        double total = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        input.close();

    }
}
