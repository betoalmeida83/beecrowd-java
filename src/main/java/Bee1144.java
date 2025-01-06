import java.util.Scanner;

public class Bee1144{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int cont = 1;

        for (int i = 1; i <= N; i++) {

            System.out.println(cont + " " + (cont*cont) + " " + (cont*cont*cont));
            System.out.println(cont + " " + ((cont*cont)+1) + " " + ((cont*cont*cont)+1));
            cont += 1;

        }

        input.close();

    }

}
