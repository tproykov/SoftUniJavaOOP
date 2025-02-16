

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreasureBag bag = new TreasureBag(Long.parseLong(scanner.nextLine()));

        String[] items = scanner.nextLine().split("\\s+");

        bag.fillBag(items);

        bag.printContent();
    }
}