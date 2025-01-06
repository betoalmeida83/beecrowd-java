import java.util.Scanner;

public class Bee1158 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++) {

            int X = input.nextInt();
            int Y = input.nextInt();

            int sum = 0;
            int cont = 0;

            while (cont < Y) {

                if (X % 2 != 0) {
                    sum += X;
                    cont++;
                }

                X++;

            }

            System.out.println(sum);

        }

        input.close();
    }
}
