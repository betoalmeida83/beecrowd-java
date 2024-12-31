import java.util.Scanner;

public class Bee1038 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o código de item: ");
        int codigo = input.nextInt();

        System.out.println("Entre com a quantidade de item: ");
        int quantidade = input.nextInt();

        switch (codigo){

            case 1:
                System.out.printf("Total: R$ %.2f\n", quantidade * 4.00);
                break;

            case 2:
                System.out.printf("Total: R$ %.2f\n", quantidade * 4.50);
                break;

            case 3:
                System.out.printf("Total: R$ %.2f\n", quantidade * 5.00);
                break;

            case 4:
                System.out.printf("Total: R$ %.2f\n", quantidade * 2.00);
                break;

            case 5:
                System.out.printf("Total: R$ %.2f\n", quantidade * 1.50);
                break;
        }

        input.close();
    }
}
