import java.util.Scanner;

public class Bee1046 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();

        int duracao = 0;

        if(horaInicial >= 12){
            duracao = (24 - horaInicial) + horaFinal;
        }
        else if (horaInicial == horaFinal){
            duracao = 24;
        }
        else{
            duracao = horaFinal - horaInicial;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        input.close();

    }
}
