package main.java.org.experis.snacks1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String res = printBiggest(a, b) == 0
                ? "Numbers are equal"
                : "The higher number is: " + printBiggest(a, b);

        System.out.println(res);
    }

    public static int printBiggest(int a, int b) {
        return a == b ? 0 : Math.max(a, b);
    }
}
