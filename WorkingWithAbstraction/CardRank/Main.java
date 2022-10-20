package WorkingWithAbstraction.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line + ":");

        for (CardRanks rank : CardRanks.values()) {
            System.out.println("Ordinal value: " + rank.ordinal() + "; Name value: " + rank);
        }
    }
}
