import java.util.Scanner;

public class Bee1008 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        numeroFuncionario = input.nextInt();
        horasTrabalhadas = input.nextInt();
        valorHora = input.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        input.close();
    }
}
