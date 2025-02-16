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

        long starsCollected = 0;
        String command;
        while (!"Let the Force be with you".equals(command = scanner.nextLine())) {

            int[] jediCoordinates = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] evilForceCoordinates = Arrays.stream(scanner.nextLine()
                    .split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int evilForceRowPosition = evilForceCoordinates[0];
            int evilForceColPosition = evilForceCoordinates[1];

            moveEvilForce(evilForceRowPosition, evilForceColPosition, matrix);

            int jediRowPosition = jediCoordinates[0];
            int jediColPosition = jediCoordinates[1];

            starsCollected = moveJediAndCollectStars(jediRowPosition, jediColPosition, matrix,
                    starsCollected);
        }

        System.out.println(starsCollected);
    }

    private static long moveJediAndCollectStars(int jediRowPosition, int jediColPosition,
                                                int[][] matrix, long starsCollected) {

        while (jediRowPosition >= 0 && jediColPosition < matrix[1].length) {

            if (jediRowPosition < matrix.length && jediColPosition >= 0
                    && jediColPosition < matrix[0].length) {

                starsCollected += matrix[jediRowPosition][jediColPosition];
            }

            jediColPosition++;
            jediRowPosition--;
        }
        return starsCollected;
    }

    private static void moveEvilForce(int evilForceRowPosition, int evilForceColPosition, int[][] matrix) {

        while (evilForceRowPosition >= 0 && evilForceColPosition >= 0) {

            if (evilForceRowPosition < matrix.length && evilForceColPosition < matrix[0].length) {
                matrix[evilForceRowPosition][evilForceColPosition] = 0;
            }

            evilForceRowPosition--;
            evilForceColPosition--;
        }
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
