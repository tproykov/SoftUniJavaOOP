package JO01WorkingWithAbstractions.E02CardRank;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Card Ranks:");
        Arrays.stream(CardRank.values())
                .forEach(System.out::println);
    }
}
