import java.util.Scanner;

import static java.lang.Math.abs;

public class Bee1013 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maiorAB = (a + b + abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");

        input.close();

    }
}
