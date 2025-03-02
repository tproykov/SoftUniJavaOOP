package JO02Encapsulation.E05FootballTeamGenerator;

import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name, List<Player> players) {
        setName(name);
        setPlayers(players);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    public double getRating() {
        double sum = 0;
        for (Player player : players) {

        }
        return 0.0;
    }


}
