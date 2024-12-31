import java.util.Scanner;

public class Bee1154 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade = input.nextInt();
        int soma = 0;
        int cont = 0;
        double media = 0.00;

        while(idade >= 0){
            soma = soma + idade;
            idade = input.nextInt();
            cont++;
        }

        media = (double) soma / cont;
        System.out.printf("%.2f%n", media);

        input.close();
    }
}
