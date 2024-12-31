import java.util.Scanner;

public class Bee1070 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println(numero+1);
            System.out.println(numero+3);
            System.out.println(numero+5);
            System.out.println(numero+7);
            System.out.println(numero+9);
            System.out.println(numero+11);
        }

        if (numero % 2 != 0){
            System.out.println(numero);
            System.out.println(numero+2);
            System.out.println(numero+4);
            System.out.println(numero+6);
            System.out.println(numero+8);
            System.out.println(numero+10);
        }

        input.close();

    }
}
