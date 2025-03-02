package JO02Encapsulation.E05FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        boolean playerExists = false;

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(playerName)) {
                players.remove(i);
                playerExists = true;
                break;
            }
        }

        if (!playerExists) {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + this.name + " team.");
        }
    }

    public double getRating() {
        if (players.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Player player : players) {
            sum += player.overallSkillLevel();
        }
        return sum / players.size();
    }
}