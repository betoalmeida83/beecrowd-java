import java.util.Scanner;

public class Bee1115 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int eixoX = input.nextInt();
        int eixoY = input.nextInt();

        while (eixoX != 0 && eixoY != 0) {

            if (eixoX > 0 && eixoY > 0) {
                System.out.println("primeiro");
            }
            else if (eixoX > 0 && eixoY < 0) {
                System.out.println("quarto");
            }
            else if (eixoX < 0 && eixoY > 0) {
                System.out.println("segundo");
            }
            else if (eixoX < 0 && eixoY < 0) {
                System.out.println("terceiro");
            }
            eixoX = input.nextInt();
            eixoY = input.nextInt();
        }

        input.close();

    }
}
