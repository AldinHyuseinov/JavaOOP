package Encapsulation.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }

    private void setName(String name) {

        if (name == null || name.isEmpty() || name.trim().isEmpty()) {
            System.out.println("A name should not be empty.");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {

        try {
            players.remove(players.stream()
                    .filter(player -> player.getName().equals(playerName))
                    .findFirst().get());
        } catch (NoSuchElementException e) {
            System.out.println("Player " + playerName + " is not in " + name + " team.");
        }
    }

    public double getRating() {
        return (players.stream()
                .map(Player::overallSkillLevel)
                .mapToDouble(Double::doubleValue).sum()) / players.size();
    }
}
