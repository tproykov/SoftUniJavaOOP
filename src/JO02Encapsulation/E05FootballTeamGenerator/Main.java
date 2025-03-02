package JO02Encapsulation.E05FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Team> teams = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).equals("END")) {

            String[] tokens = input.split(";");

            String command = tokens[0];
            String teamName = tokens[1];

            switch (command) {
                case "Team":
                    Team team = new Team(teamName);
                    teams.add(team);
                    break;
                case "Add":
                    
                    break;

                case "Remove":
                    break;
            }
        }


    }
}
