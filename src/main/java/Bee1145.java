import java.util.Scanner;

public class Bee1145 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();

        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            if (i % X == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        input.close();

    }

}
