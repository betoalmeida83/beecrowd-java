import java.util.Scanner;

public class Bee1040 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float N1 = input.nextFloat();
        float N2 = input.nextFloat();
        float N3 = input.nextFloat();
        float N4 = input.nextFloat();

        float media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        if (media >= 5.0 && media <= 6.9){
            float exame = input.nextFloat();
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f%n", exame);

            if ((exame + media)/2 >= 5.0) {
                System.out.println("Aluno aprovado.");
            }
            else{

                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", (exame + media)/2);
        }

        else if (media >= 7.0){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        }

        else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        }

        input.close();

    }
}
