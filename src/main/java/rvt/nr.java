package rvt;

import java.util.Scanner;

public class nr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; 
        int sum = 0; 
        int input;

        do {
            System.out.print("Enter a number (0 to stop): ");
            input = scanner.nextInt();
            if (input != 0) {
                count++;
                sum += input;
            }
        } while (input != 0);

        System.out.println("Amount of numbers inputted: " + count);
        System.out.println("Sum of numbers: " + sum);
    }
}