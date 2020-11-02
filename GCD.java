package com.company;

import java.util.Scanner;

public class GCD {
    private static int findGCD(int a, int b) {
        int temp;
        // Maintain consistency of a>b
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        while (true) {
            if (a % b == 0)
                return b;
            else if (b == 1)
                return 1;
            else {
                a = a % b;
                temp = a;
                a = b;
                b = temp;
            }
        }

    }

    // program to find GCD.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("GCD of two numbers are-" + findGCD(a, b));


    }


}
