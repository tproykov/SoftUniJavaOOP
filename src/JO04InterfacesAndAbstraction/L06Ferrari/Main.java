package JO04InterfacesAndAbstraction.L06Ferrari;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String driverName = scanner.nextLine();

        Car ferrari = new Ferrari(driverName);
    }
}