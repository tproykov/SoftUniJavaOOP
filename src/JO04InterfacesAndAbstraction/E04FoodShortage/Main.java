package JO04InterfacesAndAbstraction.E04FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Buyer> buyers = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            if (tokens.length == 4) {
                buyers.add(new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]));
            } else if (tokens.length == 3) {
                buyers.add(new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            }
        }

        String command;
        while (!"End".equals(command = scanner.nextLine())) {
            for (Buyer buyer : buyers) {
                if (buyer instanceof Person) {
                    Person person = (Person) buyer;
                    if (person.getName().equals(command)) {
                        buyer.buyFood();
                        break;
                    }
                }
            }
        }

        int totalFoodPurchased = buyers.stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFoodPurchased);
    }
}
