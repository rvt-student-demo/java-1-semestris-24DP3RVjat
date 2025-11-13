package rvt;

import java.util.Scanner;

public class kods {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

while(true) {
    System.out.println("Input positive nrs.");
    int number = Integer.valueOf(scanner.nextLine());

    if (number == 0) {
        break;
    }

    if (number < 0) {
        System.out.println("Unfit nmber! Try again. ");
        continue;
    }

    System.out.println("Your input was " + number);
}
    
}
}