package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {

        Scanner scanner = new Scanner(System.in);

        Constructor<BlackBoxInt> constructor = BlackBoxInt.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Method[] methods = blackBoxInt.getClass().getDeclaredMethods();

        Field innerValue = blackBoxInt.getClass().getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        String command;
        while (!"END".equals(command = scanner.nextLine())) {

            String[] commandParts = command.split("_");
            String commandType = commandParts[0];
            int value = Integer.parseInt(commandParts[1]);

            Method currentMethod = Arrays.stream(methods)
                    .filter(method -> method.getName().equals(commandType))
                    .findFirst()
                    .orElse(null);

            currentMethod.setAccessible(true);
            currentMethod.invoke(blackBoxInt, value);

            System.out.println(innerValue.get(blackBoxInt));
        }
    }
}