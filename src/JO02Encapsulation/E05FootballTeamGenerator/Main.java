package JO02Encapsulation.E05FootballTeamGenerator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("END")) {

            String[] tokens = input.split(";");

            String command = tokens[0];
            String teamName = tokens[1];
            String playerName;

            switch (command) {
                case "Team":
                    teamName = tokens[1];
                    teams.put(teamName, new Team(teamName));
                    break;

                case "Add":
                    playerName = tokens[2];
                    int endurance = Integer.parseInt(tokens[3]);
                    int sprint = Integer.parseInt(tokens[4]);
                    int dribble = Integer.parseInt(tokens[5]);
                    int passing = Integer.parseInt(tokens[6]);
                    int shooting = Integer.parseInt(tokens[7]);

                    if (!teams.containsKey(teamName)) {
                        System.out.println("Team " + teamName + " does not exist.");
                        break;
                    }

                    Player player = new Player(playerName, endurance, sprint, dribble,
                            passing, shooting);
                    teams.get(teamName).addPlayer(player);
                    break;

                case "Remove":
                    playerName = tokens[2];
                    if (!teams.containsKey(teamName)) {
                        System.out.println("Team " + teamName + " does not exist.");
                        break;
                    }

                    teams.get(teamName).removePlayer(playerName);
                    break;

                case "Rating":
                    int rating = (int) Math.round(teams.get(teamName).getRating());
                    System.out.println(teamName + " - " + rating);
            }
        }
    }
}