import java.util.Scanner;

public class Bee1072 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int contIn = 0;
        int contOut = 0;

        for(int i = 0; i<N; i++) {

            int X = input.nextInt();

            if (X >= 10 && X <= 20) {
                contIn++;
            }
            else {
                contOut++;
            }
        }

        System.out.println(contIn +" in");
        System.out.println(contOut +" out");

        input.close();

    }
}
