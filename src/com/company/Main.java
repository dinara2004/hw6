package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
            System.out.print(i);
            if (i < a) {
                System.out.print("*");
            }
        }
        System.out.print("=" + sum);
    }
}
