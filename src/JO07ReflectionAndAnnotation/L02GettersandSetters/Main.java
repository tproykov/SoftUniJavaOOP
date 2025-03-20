package JO07ReflectionAndAnnotation.L02GettersandSetters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Class<?> reflectionClass = Reflection.class;

        Method[] allMethods = reflectionClass.getDeclaredMethods();

        Method[] getters = Arrays.stream(allMethods)
                .filter(Main::isGetter)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        Method[] setters = Arrays.stream(allMethods)
                .filter(Main::isSetter)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        for (Method getter : getters) {
            System.out.println(getter.getName() + " will return class " + getter.getReturnType().getName());
        }

        for (Method setter : setters) {
            System.out.println(setter.getName() + " and will set field of class " +
                    setter.getParameterTypes()[0].getName());
        }
    }

    private static boolean isGetter(Method method) {
        // Getter must start with "get" or "is" (for boolean), have no parameters, and return something
        if (method.getParameterCount() > 0) {
            return false;
        }

        if (method.getReturnType().equals(void.class)) {
            return false;
        }

        String methodName = method.getName();
        return (methodName.startsWith("get") && methodName.length() > 3) ||
                (methodName.startsWith("is") && methodName.length() > 2);
    }

    private static boolean isSetter(Method method) {

        if (method.getParameterCount() != 1) {
            return false;
        }

        String methodName = method.getName();
        return methodName.startsWith("set") && methodName.length() > 3;
    }
}