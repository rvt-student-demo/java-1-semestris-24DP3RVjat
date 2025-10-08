package rvt;

import java.util.Scanner;

public class carryon {
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Shall we carry on?");
    String input = scanner.nextLine();
    if (input.equals("no")) {
        break;
    }

    System.out.println("Finally, carry on!");
}

System.out.println("Paldies!");

}
