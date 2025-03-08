package JO04InterfacesAndAbstraction.E03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        String command;
        while (!"End".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Citizen":
                    birthables.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
                    break;
                case "Pet":
                    birthables.add(new Pet(tokens[1], tokens[2]));
                    break;
            }
        }

        String birthYear = scanner.nextLine();

        for (Birthable birthable : birthables) {
            if (birthable.getBirthDay().endsWith(birthYear)) {
                System.out.println(birthable.getBirthDay());
            }
        }
    }
}