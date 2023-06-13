package JAVA.Lesson_3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class count_elms {
    public static void main(String[] args) {
        final List<String> PLANETS = Arrays.asList("earth", "mars", "venera", "jupyter", "saturn", "neptun", "uran",
                "mercury");
        List<Integer> numbers = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] planets = input.split("\\s*,\\s*");
        for (String planet : planets) {
            int idx = PLANETS.indexOf(planet.toLowerCase());
            if (idx != -1) {
                numbers.set(idx, numbers.get(idx) + 1);
            }
        }
        for (int i = 0; i < PLANETS.size(); ++i) {
            if (numbers.get(i) > 0) {
                System.out.println(PLANETS.get(i) + ": " + numbers.get(i));
            }
        }
    }
}
