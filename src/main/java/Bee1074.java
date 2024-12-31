import java.util.Scanner;

public class Bee1074 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++) {

            int X = input.nextInt();

            if (X %2 == 0 && X < 0) {
                System.out.println("EVEN NEGATIVE");
            }
            else if (X %2 == 0 && X > 0) {
                System.out.println("EVEN POSITIVE");
            }

            else if (X %2 != 0 && X < 0) {
                System.out.println("ODD NEGATIVE");
            }

            else if (X %2 != 0 && X > 0){
                System.out.println("ODD POSITIVE");
            }

            else if (X == 0){
                System.out.println("NULL");

            }
        }

        input.close();
    }
}
