package Encapsulation.FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {

        if (name == null || name.isEmpty() || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setEndurance(int endurance) {
        this.endurance = checkStats("Endurance", endurance);
    }

    private void setSprint(int sprint) {
        this.sprint = checkStats("Sprint", sprint);
    }

    private void setDribble(int dribble) {
        this.dribble = checkStats("Dribble", dribble);
    }

    private void setPassing(int passing) {
        this.passing = checkStats("Passing", passing);
    }

    private void setShooting(int shooting) {
        this.shooting = checkStats("Shooting", shooting);
    }

    private int checkStats(String statName, int stat) {

        if (stat < 0 || stat > 100) {
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
        return stat;
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) * 1.0 / 5;
    }
}
