package Reflection.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        Field field = clazz.getDeclaredField("innerValue");
        field.setAccessible(true);

        while (!command.equals("END")) {
            String[] commandArr = command.split("_");
            int value = Integer.parseInt(commandArr[1]);

            Arrays.stream(methods).filter(method -> method.getName().equals(commandArr[0])).forEach(method -> {
                method.setAccessible(true);

                try {
                    method.invoke(blackBoxInt, value);
                    System.out.println(field.get(blackBoxInt));
                } catch (IllegalAccessException | InvocationTargetException ignored) {
                }
            });
            command = scanner.nextLine();
        }
    }
}
