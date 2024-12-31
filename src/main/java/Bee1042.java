import java.util.Scanner;

public class Bee1042 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // num1 -14/ num2 7 / num3 21
        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println("");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }

        // num1 -14 / num3 7 / num2 21
        if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
            System.out.println("");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
        // num2 -14 / num1 7 / num3 21
        if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
            System.out.println("");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
        // num2 -14 / num3 7 / num1 21
        if (num2 <= num3 && num2 <= num1 && num3 <= num1) {
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
            System.out.println("");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
        // num3 -14 / num1 7 / num2 21
        if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println("");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
        // num3 -14 / num2 7 / num1 21
        if (num3 <= num2 && num3 <= num1 && num2 <= num1) {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
            System.out.println("");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }

        input.close();

    }
}
