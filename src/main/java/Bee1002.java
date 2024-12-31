import java.util.Scanner;

public class Bee1002 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        input.close();
    }
}
