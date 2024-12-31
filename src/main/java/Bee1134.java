import java.util.Scanner;

public class Bee1134 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao = 0;
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while(opcao < 1 || opcao > 4) {
            opcao = input.nextInt();
        }

        while(opcao != 4) {
            if (opcao == 1) {
                alcool = alcool + 1;
            } else if (opcao == 2) {
                gasolina = gasolina + 1;
            } else if (opcao == 3) {
                diesel = diesel + 1;
            }
            opcao = input.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}
