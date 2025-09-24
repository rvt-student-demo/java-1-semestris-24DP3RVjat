package rvt;

import java.util.Scanner;

public class sumofthreenr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti pirmo skaitli:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Ieraksti otro skaitli:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Ieraksti treso skaitli:");
        int third = Integer.valueOf(scanner.nextLine());
        int sum = first + second + third;
        System.out.println("Skaitla summa ir " + sum);
        scanner.close();
        
    }
    
}
