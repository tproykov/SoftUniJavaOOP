package JO02Encapsulation.E05FootballTeamGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        while (!(input = scanner.nextLine()).equals("END")) {
            String[] tokens = input.split(";");
            switch (tokens[0]) {
                case "Team":
                    
                    break;

                case "Add":
                    break;

                case "Remove":
                    break;
            }
        }


    }
}
