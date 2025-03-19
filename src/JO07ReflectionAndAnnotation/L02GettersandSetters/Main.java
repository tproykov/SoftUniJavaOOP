package JO07ReflectionAndAnnotation.L02GettersandSetters;

import JO07ReflectionAndAnnotation.L01Reflection.Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Class reflectionClass = Reflection.class;

        Method[] allMethods = reflectionClass.getDeclaredMethods();

        Arrays.stream(allMethods)
                .filter(method -> method.getName().startsWith("get"))
                .forEach(getter -> System.out.printf("%s will return class %s\n",
                        getter.getName(), getter.getReturnType().getSimpleName()));

        for (Method method : allMethods) {
            if (method.getName().startsWith("set")) {
                Class[] parameterTypes = method.getParameterTypes();
                System.out.printf("%s and will set field of class %s\n", method.getName(),
                        parameterTypes[0].getSimpleName());
            }
        }









    }
}
