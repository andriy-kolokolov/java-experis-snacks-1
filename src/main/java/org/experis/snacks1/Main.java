package main.java.org.experis.snacks1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Snack snack = new Snack();

        System.out.println("Chose snack: 1,2,3,4,5 : ");
        int userSelect = sc.nextInt();

        switch (userSelect) {
            case 1: {
                System.out.println("First number: ");
                int a = sc.nextInt();
                System.out.println("Second number: ");
                int b = sc.nextInt();

                String res = snack.printBiggest(a, b) == 0
                        ? "Numbers are equal"
                        : "The higher number is: " + snack.printBiggest(a, b);

                System.out.println(res);
                break;
            }
            case 2: {
                System.out.println("First string: ");
                String a = sc.next();
                System.out.println("Second string: ");
                String b = sc.next();
                System.out.println("The longer string is: " + snack.getLonger(a, b));
                break;
            }
            case 3: {
                int limit = 10;
                int sum = 0;
                for (int i = 1; i <= limit; i++) {
                    System.out.println("Insert " + i + " number");
                    sum += sc.nextInt();
                }
                System.out.println("The sum of 10 numbers is: " + sum);
            }
        }
    }


}
