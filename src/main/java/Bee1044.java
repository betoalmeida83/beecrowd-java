import java.util.Scanner;

public class Bee1044 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        if (B % A == 0 || A % B == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        input.close();

    }
}
