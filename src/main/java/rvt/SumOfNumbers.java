package rvt;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti pirmo skaitli:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Ieraksti otro skaitli:");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = first + second;
        System.out.println("Skaitla summa ir " + sum);
        scanner.close();
    }
}
