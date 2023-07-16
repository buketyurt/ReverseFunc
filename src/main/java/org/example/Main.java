package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N Sayısı : ");
        int number = scanner.nextInt();
        recursiveMethod(number);
    }

    public static void recursiveMethod(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        recursiveMethod(n - 5);

        System.out.print(n + " ");

    }
}