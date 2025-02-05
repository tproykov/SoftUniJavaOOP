package JO01WorkingWithAbstractions;

import java.util.Scanner;

public class L01RhombusOfStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        printRombusOfStars(size);
    }

    public static void printRombusOfStars(int size) {

        if (size == 1) {
            System.out.println("*");
            return;
        }

        for (int i = 1; i <= size; i++) {
            printBlanks(size, i);
            printRow(i);
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            printBlanks(size, i);
            printRow(i);
            System.out.println();
        }
    }

    private static void printRow(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
    }

    private static void printBlanks(int size, int i) {
        for (int j = size - i; j >= 1; j--) {
            System.out.print(" ");
        }
    }
}
