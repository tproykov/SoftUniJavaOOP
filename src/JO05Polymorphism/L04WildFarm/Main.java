package JO05Polymorphism.L04WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] animalInfo = input.split("\\s+");
            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];

            Animal animal = null;

            switch (animalType) {
                case "Cat":
                    String catBreed = animalInfo[4];
                    animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
                    break;
                case "Tiger":
                    animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Mouse":
                    animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
            }

            String[] foodInfo = scanner.nextLine().split("\\s+");
            String foodType = foodInfo[0];
            int foodQuantity = Integer.parseInt(foodInfo[1]);

            Food food = null;

            if (foodType.equals("Vegetable")) {
                food = new Vegetable(foodQuantity);
            } else if (foodType.equals("Meat")) {
                food = new Meat(foodQuantity);
            }

            animal.makeSound();
            animal.eat(food);

            System.out.println(animal);

            input = scanner.nextLine();
        }
    }
}