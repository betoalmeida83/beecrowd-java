import java.util.Locale;
import java.util.Scanner;

public class Bee1041 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        double X = input.nextDouble();
        System.out.println("Informe o valor de Y: ");
        double Y = input.nextDouble();

        if (X > 0 && Y > 0) {
            System.out.println("Q1");
        }
        else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        }
        else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        }
        else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        }
        else if (X == 0 && Y != 0){
            System.out.println("Eixo X");
        }
        else if (Y == 0 && X != 0){
            System.out.println("Eixo Y");
        }
        else if (X == 0 && Y == 0){
            System.out.println("Origem");
        }

        input.close();

    }
}
