package org.example;

import java.util.Scanner;

public class Bee1067 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        int cont = 1;

        for (int i = 0; i < numero; i++) {
            i += 1;
            System.out.println(cont);
            cont += 2;
        }

        input.close();
    }
}

