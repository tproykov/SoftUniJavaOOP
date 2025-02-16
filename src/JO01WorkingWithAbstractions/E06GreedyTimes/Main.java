package JO01WorkingWithAbstractions.E06GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());

        String[] treasureItems = scanner.nextLine().split("\\s+");

        var itemsInBag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        // Map<String, Long> itemsInBagMap = new LinkedHashMap<>();

        long Gold = 0;
        long Gems = 0;
        long Cash = 0;

        for (int i = 0; i < treasureItems.length; i += 2) {

            String currentItem = treasureItems[i];
            long currentItemCount = Long.parseLong(treasureItems[i + 1]);

            String currentItemType = "";
            if (currentItem.length() == 3) {
                currentItemType = "Cash";
            } else if (currentItem.toLowerCase().endsWith("gem")) {
                currentItemType = "Gem";
            } else if (currentItem.equalsIgnoreCase("gold")) {
                currentItemType = "Gold";
            }

            if (currentItemType.isEmpty()) {
                continue;
            }
            else if (bagCapacity < itemsInBag.values()
                    .stream()
                    .map(Map::values)
                    .flatMap(Collection::stream)
                    .mapToLong(e -> e).sum() + currentItemCount) {
                continue;
            }

            switch (currentItemType) {
                case "Gem":
                    if (!itemsInBag.containsKey(currentItemType)) {
                        if (itemsInBag.containsKey("Gold")) {
                            if (currentItemCount > itemsInBag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (itemsInBag.get(currentItemType).values().stream().mapToLong(e -> e).sum() + currentItemCount > itemsInBag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!itemsInBag.containsKey(currentItemType)) {
                        if (itemsInBag.containsKey("Gem")) {
                            if (currentItemCount > itemsInBag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (itemsInBag.get(currentItemType).values().stream().mapToLong(e -> e).sum() + currentItemCount > itemsInBag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!itemsInBag.containsKey(currentItemType)) {
                itemsInBag.put((currentItemType), new LinkedHashMap<String, Long>());
            }

            if (!itemsInBag.get(currentItemType).containsKey(currentItem)) {
                itemsInBag.get(currentItemType).put(currentItem, 0L);
            }


            itemsInBag.get(currentItemType).put(currentItem, itemsInBag.get(currentItemType).get(currentItem) + currentItemCount);
            if (currentItemType.equals("Gold")) {
                Gold += currentItemCount;
            } else if (currentItemType.equals("Gem")) {
                Gems += currentItemCount;
            } else if (currentItemType.equals("Cash")) {
                Cash += currentItemCount;
            }
        }

        for (var x : itemsInBag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", x.getKey(), sumValues);

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}