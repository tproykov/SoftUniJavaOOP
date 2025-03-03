package JO03Inheritance.E06Animals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();

        while (!input1.equals("Beast!")) {

            String animalType = input1;

            String[] tokens = scanner.nextLine().split("\\s+");
            String animalName = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String gender = tokens[2];

            if (age < 0 || !gender.equals("Male") && !gender.equals("Female")) {
                System.out.println("Invalid input!");
                input1 = scanner.nextLine();
                break;
            }

            switch (animalType) {
                case "Cat":
                    Animal cat = new Cat(animalName, age, gender);

                    break;

                case "Dog":
                    Animal dog = new Dog();
                    dog.setName(animalName);
                    dog.setAge(age);
                    dog.setGender(gender);
                    break;

                case "Frog":
                    Animal frog = new Frog();
                    frog.setName(animalName);
                    frog.setAge(age);
                    frog.setGender(gender);
                    break;
            }


            input1 = scanner.nextLine();
        }


    }
}
