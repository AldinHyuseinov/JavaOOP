package Encapsulation.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Team> teams = new ArrayList<>();

        while (!command.equals("END")) {
            String[] commandArr = command.split(";");

            switch (commandArr[0]) {
                case "Team":
                    teams.add(new Team(commandArr[1]));
                    break;
                case "Add":

                    if (teams.stream().map(Team::getName).noneMatch(teamName -> teamName.equals(commandArr[1]))) {
                        System.out.println("Team " + commandArr[1] + " does not exist.");
                        command = scanner.nextLine();
                        continue;
                    }

                    try {
                        teams.stream().filter(team -> team.getName().equals(commandArr[1]))
                                .findFirst().get()
                                .addPlayer(new Player(commandArr[2], Integer.parseInt(commandArr[3]),
                                        Integer.parseInt(commandArr[4]), Integer.parseInt(commandArr[5]),
                                        Integer.parseInt(commandArr[6]), Integer.parseInt(commandArr[7])));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Remove":

                    for (Team team : teams) {

                        if (team.getName().equals(commandArr[1])) {
                            team.removePlayer(commandArr[2]);
                            break;
                        }
                    }
                    break;
                case "Rating":

                    try {
                        System.out.println(commandArr[1] + " - " + Math.round(teams.stream()
                                .filter(team -> team.getName().equals(commandArr[1])).findFirst().get().getRating()));
                    } catch (NoSuchElementException e) {
                        System.out.println("Team " + commandArr[1] + " does not exist.");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
