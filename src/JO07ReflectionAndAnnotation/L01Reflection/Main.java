package JO07ReflectionAndAnnotation.L01Reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Reflection> reflectionClass = Reflection.class;

        System.out.println(reflectionClass.getSimpleName());
        System.out.println(reflectionClass.getSuperclass());

        for (Class<?> interfaceClass : reflectionClass.getInterfaces()) {
            System.out.println(interfaceClass.getSimpleName());
        }

        Object object = reflectionClass.getDeclaredConstructor().newInstance();
        System.out.println(object);
    }
}