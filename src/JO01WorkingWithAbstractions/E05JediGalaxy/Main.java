package JO01WorkingWithAbstractions.E05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        fillTheMatrix(rows, cols, matrix);

        long sum = 0;

        String command;
        while (!"Let the Force be with you".equals(command = scanner.nextLine())) {

            int[] ivoS = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] evil = Arrays.stream(scanner.nextLine()
                    .split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int xE = evil[0];
            int yE = evil[1];

            while (xE >= 0 && yE >= 0) {

                if (xE >= 0 && xE < matrix.length && yE >= 0 && yE < matrix[0].length) {
                    matrix[xE][yE] = 0;
                }

                xE--;
                yE--;
            }

            int xI = ivoS[0];
            int yI = ivoS[1];

            while (xI >= 0 && yI < matrix[1].length) {

                if (xI >= 0 && xI < matrix.length && yI >= 0 && yI < matrix[0].length) {
                    sum += matrix[xI][yI];
                }

                yI++;
                xI--;
            }
        }

        System.out.println(sum);
    }

    private static void fillTheMatrix(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }
    }
}
