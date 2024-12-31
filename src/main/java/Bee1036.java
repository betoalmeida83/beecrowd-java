import java.util.Scanner;

public class Bee1036 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double delta = Math.pow(B, 2.0) - (4.0 * A * C);

        double R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
        double R2 = (-B - Math.sqrt(delta)) / (2.0 * A);

        if (delta < 0.0 || A == 0.0){
            System.out.println("Impossivel calcular");
        }

        else{
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

        input.close();

    }
}
