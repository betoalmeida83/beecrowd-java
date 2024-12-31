import java.util.Scanner;

public class Bee1014 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        double Y = input.nextDouble();
        double consumoMedio = X / Y;

        System.out.printf("%.3f km/l\n", consumoMedio);

        input.close();

    }
}
