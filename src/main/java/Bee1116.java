import java.util.Scanner;

public class Bee1116 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        double resultado = 0;

        for (int i = 0; i < N; i++){
            int X = input.nextInt();
            int Y = input.nextInt();

            if(Y == 0){
                System.out.println("divisao impossivel");
            }
            else {
                resultado = (double) X / (double) Y;
                System.out.printf("%.1f\n", resultado);
            }
        }

        input.close();

    }
}
