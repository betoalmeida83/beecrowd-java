import java.util.Scanner;

public class Bee1132 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();
        int soma = 0;

        if (X > Y) {
            for (int i = Y; i <= X; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }
        else {
            for (int i = X; i <= Y; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }

        System.out.print(soma);
        input.close();

    }
}
