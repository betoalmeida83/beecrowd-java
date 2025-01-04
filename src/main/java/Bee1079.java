import java.util.Scanner;

public class Bee1079 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int N = input.nextInt();
            double media = 0;

            for (int i = 0; i < N; i++){
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                media = (a*2 + b*3 + c*5) / 10;

                System.out.printf("%.1f\n", media);
            }

            input.close();

    }
}
