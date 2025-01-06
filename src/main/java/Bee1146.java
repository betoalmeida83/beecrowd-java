import java.util.Scanner;

public class Bee1146 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        while (X != 0) {

            for (int i = 1; i < X; i++) {

                System.out.print(i + " ");
            }

            System.out.println(X);

            X = input.nextInt();

        }

        input.close();

    }
}
