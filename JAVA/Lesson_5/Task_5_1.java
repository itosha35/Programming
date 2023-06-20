package JAVA.Lesson_5;

import java.util.HashMap;
import java.util.Map;

public class Task_5_1 {
    public static void main(String[] args) {
        Map<Integer, String> passp = new HashMap<>();
        passp.put(1, "NEW");
        for (var i : passp.entrySet()) {
            if (i.getValue().equals("NEW")) {
                System.out.printf("%d, %s \n",i.getKey(),i.getValue());
            }
        }
    }

}
