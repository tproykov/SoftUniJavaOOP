package JO04InterfacesAndAbstraction.L05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String command;
        while (!"End".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");

            if (tokens.length == 2) {
                identifiables.add(new Robot(tokens[0], tokens[1]));
            }
            if (tokens.length == 3) {
                identifiables.add(new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            }
        }

        String falseId = scanner.nextLine();

        for (Identifiable identifiable : identifiables) {
            if (identifiable.getId().contains(falseId)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}