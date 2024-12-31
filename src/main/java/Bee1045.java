import java.util.Scanner;

public class Bee1045 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double aux;

        if (A >= B && A >= C && B >= C) {
            A = A;
            B = B;
            C = C;
        }
        else if(A >= B && A >= C && C >= B){
            aux = B;
            A = A;
            B = C;
            C = aux;
        }
        else if(B >= A && B >= C && A >= C){
            aux = A;
            A = B;
            B = aux;
            C = C;
        }
        else if(B >= A && B >= C && C >= A){
            aux = A;
            A = B;
            B = C;
            C = aux;
        }
        else if(C >= A && C >= B && A >= B){
            aux = A;
            A = C;
            B = aux;
            C = B;
        }
        else if(C >= A && C >= B && B >= A){
            aux = A;
            A = C;
            B = B;
            C = aux;
        }

        if(A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if(Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if(Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if(Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if(A == B && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if(A == B || B == C || A == C){
            System.out.println("TRIANGULO ISOSCELES");
        }

        input.close();

    }
}
