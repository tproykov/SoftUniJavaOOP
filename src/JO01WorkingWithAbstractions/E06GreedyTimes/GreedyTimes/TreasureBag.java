

import java.util.LinkedHashMap;
import java.util.Map;

public class TreasureBag {

    private final long capacity;
    private final Map<TreasureType, Map<String, Long>> items;
    private long currentWeight;

    public TreasureBag(long capacity) {
        this.capacity = capacity;
        this.items = new LinkedHashMap<>();
        this.currentWeight = 0;
    }

    public void fillBag(String[] treasureItems) {

        for (int i = 0; i < treasureItems.length; i += 2) {

            String itemName = treasureItems[i];
            long itemQuantity = Long.parseLong(treasureItems[i + 1]);

            TreasureType type = TreasureType.identifyType(itemName);
            if (type == null || !canAddItem(itemQuantity, type)) {
                continue;
            }

            addItem(itemName, itemQuantity, type);
        }
    }

    private boolean canAddItem(long itemQuantity, TreasureType type) {
        if (exceedsBagCapacity(itemQuantity)) {
            return false;
        }

        return switch (type) {
            case GEM -> hasEnoughGold(itemQuantity);
            case CASH -> hasEnoughGems(itemQuantity);
            case GOLD -> true;
        };
    }

    private boolean exceedsBagCapacity(long itemQuantity) {
        return currentWeight + itemQuantity > capacity;
    }

    private boolean hasEnoughGold(long itemQuantity) {
        long currentGoldAmount = getTotalAmount(TreasureType.GOLD);
        long currentGemAmount = getTotalAmount(TreasureType.GEM);
        return currentGoldAmount >= currentGemAmount + itemQuantity;
    }

    private boolean hasEnoughGems(long itemQuantity) {
        long currentGemAmount = getTotalAmount(TreasureType.GEM);
        long currentCashAmount = getTotalAmount(TreasureType.CASH);
        return currentGemAmount >= currentCashAmount + itemQuantity;
    }

    private long getTotalAmount(TreasureType type) {
        return items.containsKey(type)
                ? items.get(type).values().stream().mapToLong(Long::longValue).sum()
                : 0;
    }

    private void addItem(String itemName, long quantity, TreasureType type) {
        items.computeIfAbsent(type, k -> new LinkedHashMap<>());
        items.get(type).merge(itemName, quantity, Long::sum);
        currentWeight += quantity;
    }

    public void printContent() {
        items.forEach((type, typeItems) -> {
            long typeTotal = typeItems.values().stream().mapToLong(Long::longValue).sum();
            System.out.printf("<%s> $%d%n", type, typeTotal);

            typeItems.entrySet().stream()
                    .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(entry -> System.out.printf("##%s - %d%n",
                            entry.getKey(), entry.getValue()));
        });
    }
}
