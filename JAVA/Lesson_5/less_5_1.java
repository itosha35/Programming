package Lesson_5;

import java.util.HashMap;
import java.util.Map;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов

// 321456 Васильев

// 234561 Петрова

// 234432 Иванов

// 654321 Петрова

// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.

public class less_5_1 {
    public static void main(String[] args) {
        Map<Integer, String> passport = new HashMap<>();
        passport.put(123456, "Иванов");
        passport.put(321456, "Васильев");
        passport.put(234561, "Петрова");
        passport.put(234432, "Иванов");
        passport.put(654321, "Петрова");
        passport.put(345678, "Иванов");
        for (var item : passport.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.printf("%d: %s \n", item.getKey(), item.getValue());
            }
        }
        for (Integer key : passport.keySet()) {
            if (passport.get(key).equals("Иванов")) {
                System.out.printf("\n %d: %s \n", key, passport.get(key));
            }
        }
    }
}