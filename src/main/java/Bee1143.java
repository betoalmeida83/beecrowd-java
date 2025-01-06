import java.util.Scanner;

public class Bee1143 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int cont = 1;

        for (int i = 1; i <= N; i++) {

            System.out.println(cont + " " + (cont*cont) + " " + (cont*cont*cont));
            cont += 1;

        }

        input.close();

    }
}
