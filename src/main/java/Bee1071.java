import java.util.Scanner;

public class Bee1071 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();
        int soma = 0;

        if (X < Y) {
            int aux = X;
            X = Y;
            Y = aux;
        }

        for (int i = Y + 1; i < X; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        input.close();

    }
}
