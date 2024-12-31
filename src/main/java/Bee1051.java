import java.util.Scanner;

public class Bee1051 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o salario: ");
        double salario = input.nextDouble();

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00) {
            salario -= 2000.00;
            salario *= 0.08;
            System.out.printf("R$ %.2f%n", salario);
        }
        else if (salario >= 3000.01 && salario <= 4500.00) {
            salario -= 2000.00;
            salario -= 1000.00;
            salario = (salario * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f%n", salario);
        }
        else if (salario > 4500.00) {
            salario -= 2000.00;
            salario -= 1000.00;
            salario -= 1500.00;
            salario = (salario * 0.28) + (1000 * 0.08) + (1500 * 0.18);
            System.out.printf("R$ %.2f%n", salario);
        }

        input.close();

    }
}
