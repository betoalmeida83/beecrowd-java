import java.util.Scanner;

public class Bee1131 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int golsInter = input.nextInt();
        int golsGremio = input.nextInt();
        int inter = 0;
        int gremio = 0;
        int empate = 0;
        int cont = 1;

        if (golsInter > golsGremio) {
            inter = inter + 1;
        }
        else if (golsGremio > golsInter) {
            gremio = gremio + 1;
        }
        else if (golsInter == golsGremio) {
            empate = empate + 1;
        }

        System.out.println("Novo grenal (1-sim 2-nao)");
        int opcao = input.nextInt();

        while (opcao == 1) {
            golsInter = input.nextInt();
            golsGremio = input.nextInt();

            cont = cont + 1;

            if (golsInter > golsGremio) {
                inter = inter + 1;
            }
            else if (golsGremio > golsInter) {
                gremio = gremio + 1;
            }
            else if (golsInter == golsGremio) {
                empate = empate + 1;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = input.nextInt();
        }

        System.out.println(cont + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empate:" + empate);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        }
        else if (gremio > inter) {
            System.out.println("Gremio venceu mais");
        }
        else if (inter == gremio) {
            System.out.println("Nao houve vencedor");
        }

        input.close();

    }
}
