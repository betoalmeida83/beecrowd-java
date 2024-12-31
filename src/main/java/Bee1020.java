import java.util.Scanner;

public class Bee1020 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ano, mes, dia;
        int idadeDias = input.nextInt();

        ano = idadeDias / 365;
        mes = (idadeDias % 365) / 30;
        dia = ((idadeDias % 365) % 30);

        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dia + " dia (s)");

        input.close();

    }
}
