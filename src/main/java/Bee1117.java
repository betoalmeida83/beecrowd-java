import java.util.Scanner;

public class Bee1117 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota;
        double media = 0.00;
        double soma = 0.00;
        int cont = 0;

        while(cont < 2) {

            nota = input.nextDouble();

            if(nota < 0 || nota > 10){
                System.out.println("nota invalida");
            }
            else{
                soma = soma + nota;
                cont = cont + 1;
            }
        }

        media = soma / 2;
        System.out.printf("media = %.2f%n", media);

        System.out.println("novo calculo (1-sim 2-nao)");
        int opcao = input.nextInt();

        while (opcao != 1 && opcao != 2){
            System.out.println("novo calculo (1-sim 2-nao)");
            opcao = input.nextInt();
        }

        while(opcao == 1){
            media = 0.00;
            soma = 0.00;
            cont = 0;

            while(cont < 2) {

                nota = input.nextDouble();

                if(nota < 0 || nota > 10){
                    System.out.println("nota invalida");
                }
                else{
                    soma = soma + nota;
                    cont = cont + 1;
                }
            }

            media = soma / 2;
            System.out.printf("media = %.2f%n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            opcao = input.nextInt();
        }

        input.close();

    }
}
