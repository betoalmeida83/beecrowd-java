import java.util.Scanner;

public class Bee1101 {

    public static void main(String[] args) {

            Scanner input = new java.util.Scanner(System.in);

            int M = input.nextInt();
            int N = input.nextInt();

            while (M > 0 && N > 0) {

                int sum = 0;

                if (M > N) {
                    for (int i = N; i <= M; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                } else {
                    for (int i = M; i <= N; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                }

                System.out.println("Sum=" + sum);

                M = input.nextInt();
                N = input.nextInt();
            }

            input.close();
    }
}
