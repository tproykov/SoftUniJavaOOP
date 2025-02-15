

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        CardRank cardRankEnum = CardRank.valueOf(cardRank);
        CardSuit cardSuitEnum = CardSuit.valueOf(cardSuit);

        System.out.printf("Card name: %s of %S; Card power: %d", cardRankEnum, cardSuitEnum,
                cardRankEnum.getPower() + cardSuitEnum.getPower());
    }
}
