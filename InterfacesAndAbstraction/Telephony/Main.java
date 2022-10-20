package InterfacesAndAbstraction.Telephony;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Smartphone smartphone = new Smartphone(Arrays
                .asList(scanner.nextLine().split(" ")), Arrays
                .asList(scanner.nextLine().split(" ")));

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
