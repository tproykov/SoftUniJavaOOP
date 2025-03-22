package JO07ReflectionAndAnnotation.E01HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Field[] fields = RichSoilLand.class.getDeclaredFields();

		Consumer<Field> printOutput = field ->
				System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
						field.getType().getSimpleName(), field.getName());

		String command;
		while (!"HARVEST".equals(command = scanner.nextLine())) {

			String finalInput = command;

			Field[] requestedFields = Arrays.stream(fields)
					.filter(field -> Modifier.toString(field.getModifiers()).equals(finalInput)
					).toArray(Field[]::new);

			if(requestedFields.length != 0){
				Arrays.stream(requestedFields).forEach(printOutput);
			}else {
				Arrays.stream(fields).forEach(printOutput);
			}
		}
	}
}