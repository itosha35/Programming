package JAVA.Lesson_3;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.Arrays;

public class count_el_2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(
                Arrays.asList("Земля", "Земля", "Земля", "Земля", "Юпитер", "Венера", "Марс", "Марс", "Плутон",
                        "Марс"));
        System.out.println(list1);
        int count = 1;
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size() - 1; i++) {
            if (!list2.contains(list1.get(i))) {
                list2.add(list1.get(i));
                count = 1;
                for (int j = i + 1; j < list1.size() - 1; j++) {
                    if (list1.get(i) == list1.get(j)) {
                        count += 1;
                    }
                }
                System.out.println(list1.get(i) + " " + count + " раза");
            }
        }
    }
}
