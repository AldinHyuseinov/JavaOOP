package WorkingWithAbstraction.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line + ":");

        for (CardSuits suit : CardSuits.values()) {
            System.out.println("Ordinal value: " + suit.ordinal() + "; Name value: " + suit);
        }
    }
}
