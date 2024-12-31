import java.util.Scanner;

public class Bee1047 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int minutoInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int minutoFinal = input.nextInt();

        int horaTotal = 0;
        int minutoTotal = 0;

        // 7 10   8 20 = 1H10M ok
        if(horaInicial < horaFinal && minutoInicial < minutoFinal){
            horaTotal = horaFinal - horaInicial;
            minutoTotal = minutoFinal - minutoInicial;
        }
        // 7 20   8 10 = 0H50M
        else if(horaInicial < horaFinal && minutoInicial > minutoFinal){
            horaTotal = (horaFinal - horaInicial) - 1;
            minutoTotal = (60 - minutoInicial) + minutoFinal;
        }
        // 8 20   7 10 = 22H50M
        else if(horaInicial > horaFinal && minutoInicial > minutoFinal){
            horaTotal = ((24 - horaInicial) + horaFinal) - 1;
            minutoTotal = (60 - minutoInicial) + minutoFinal;
        }
        // 8 10   7 20 = 23H10M
        else if(horaInicial > horaFinal && minutoInicial < minutoFinal){
            horaTotal = (24 - horaInicial) + horaFinal;
            minutoTotal = minutoFinal - minutoInicial;
        }
        // 7  7   7  7 = 24H00M
        else if (horaInicial == horaFinal && minutoInicial == minutoFinal){
            horaTotal = 24;
            minutoTotal = 0;
        }
        // 7 10   7 20 = 00H10M
        else if(horaInicial == horaFinal && minutoInicial < minutoFinal){
            horaTotal = 0;
            minutoTotal = minutoFinal - minutoInicial;
        }
        // 7 20   7 10 = 23H50M
        else if(horaInicial == horaFinal && minutoInicial > minutoFinal){
            horaTotal = 23;
            minutoTotal = (60 - minutoInicial) + minutoFinal;
        }
        // 7 10   8 10 = 1H00M
        else if(horaInicial < horaFinal && minutoInicial == minutoFinal){
            horaTotal = horaFinal - horaInicial;
            minutoTotal = 0;
        }
        // 8 10   7 10 = 23H00M
        else if(horaInicial > horaFinal && minutoInicial == minutoFinal){
            horaTotal = (24 - horaInicial) + horaFinal;
            minutoTotal = 0;
        }

        System.out.println("O JOGO DUROU " + horaTotal + " HORA(S) E " + minutoTotal + " MINUTO(S)");

        input.close();
    }
}
