package JO07ReflectionAndAnnotation.L01Reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {

        Class reflectionClass = Reflection.class;

        System.out.println(reflectionClass);

        System.out.println(reflectionClass.getSuperclass());

        for (Class anInterface : reflectionClass.getInterfaces()) {
            System.out.println(anInterface);
        }

        Reflection object = (Reflection) reflectionClass.getDeclaredConstructor().newInstance();
        System.out.println(object);
    }
}