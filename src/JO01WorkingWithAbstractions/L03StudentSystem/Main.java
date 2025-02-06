package JO01WorkingWithAbstractions.L03StudentSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        String command;
        while (!"Exit".equals(command = scanner.nextLine())) {

            String[] tokens = command.split(" ");

            studentSystem.ParseCommand(tokens);
        }
    }
}