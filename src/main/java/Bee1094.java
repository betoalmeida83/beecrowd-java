import java.util.Scanner;

public class Bee1094 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int quantidade = 0;
        int total = 0;
        int coelho = 0;
        int sapo = 0;
        int rato = 0;

        for (int i = 0; i < N; i++) {

            quantidade = input.nextInt();
            total = total + quantidade;
            char cobaia = input.next().charAt(0);

            if (cobaia == 'C') {
                coelho = coelho + quantidade;
            }
            else if (cobaia == 'R') {
                rato = rato + quantidade;
            }
            else if (cobaia == 'S') {
                sapo = sapo + quantidade;
            }

        }

        double percentualCoelhos = ((double) coelho/(double) total) * 100;
        double percentualRatos = ((double) rato/(double) total) * 100;
        double percentualSapos = ((double) sapo/(double) total) * 100;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

        input.close();

    }
}
