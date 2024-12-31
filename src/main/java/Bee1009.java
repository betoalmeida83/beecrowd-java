import java.util.Scanner;

public class Bee1009 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();

        double total = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);

        input.close();

    }
}
