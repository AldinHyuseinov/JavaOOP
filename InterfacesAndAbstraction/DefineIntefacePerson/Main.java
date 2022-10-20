package InterfacesAndAbstraction.DefineIntefacePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<Buyer> buyers = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = scanner.nextLine().split(" ");
            int age = Integer.parseInt(input[1]);

            if (input.length == 4) {
                buyers.add(new Citizen(input[0], age, input[2], input[3]));
            } else {
                buyers.add(new Rebel(input[0], age, input[2]));
            }
        }

        String command = scanner.nextLine();
        Predicate<Buyer> predicate;

        while (!command.equals("End")) {
            String person = command;
            predicate = buyer -> buyer.getName().equals(person);

            if (buyers.stream().anyMatch(predicate)) {
                buyers.stream().filter(predicate).findFirst().get().buyFood();
            }
            command = scanner.nextLine();
        }

        System.out.println(buyers.stream().map(Buyer::getFood).mapToInt(Integer::intValue).sum());
    }
}
