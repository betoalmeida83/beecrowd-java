import java.util.Scanner;

public class Bee1159 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        int cont = 0;
        int soma = 0;

        while (valor != 0) {
            soma = 0;
            cont = 0;
            if (valor % 2 != 0) {
                valor = valor + 1;
            }
            while (cont < 5) {
                soma = soma + valor;
                valor = valor + 2;
                cont++;
            }
            System.out.println(soma);
            valor = input.nextInt();
        }
        input.close();

    }
}
