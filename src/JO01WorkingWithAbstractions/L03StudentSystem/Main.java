package JO01WorkingWithAbstractions.L03StudentSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        String input;
        while (!"Exit".equals(input = scanner.nextLine())) {

            String[] command = input.split(" ");

            studentSystem.ParseCommand(command);
        }
    }
}