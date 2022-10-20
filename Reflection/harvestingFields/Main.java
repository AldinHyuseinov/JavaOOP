package Reflection.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Class clazz = RichSoilLand.class;
        Field[] fields = clazz.getDeclaredFields();

        while (!command.equals("HARVEST")) {

            switch (command) {
                case "private":
                    Arrays.stream(fields)
                            .filter(field -> Modifier.isPrivate(field.getModifiers()))
                            .forEach(field -> System.out.println("private " + field
                                    .getType().getSimpleName() + " " + field.getName()));
                    break;
                case "protected":
                    Arrays.stream(fields)
                            .filter(field -> Modifier.isProtected(field.getModifiers()))
                            .forEach(field -> System.out.println("protected " + field
                                    .getType().getSimpleName() + " " + field.getName()));
                    break;
                case "public":
                    Arrays.stream(fields)
                            .filter(field -> Modifier.isPublic(field.getModifiers()))
                            .forEach(field -> System.out.println("public " + field
                                    .getType().getSimpleName() + " " + field.getName()));
                    break;
                case "all":
                    Arrays.stream(fields)
                            .forEach(field -> System.out.println(Modifier
                                    .toString(field.getModifiers()) + " " + field
                                    .getType().getSimpleName() + " " + field.getName()));
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
