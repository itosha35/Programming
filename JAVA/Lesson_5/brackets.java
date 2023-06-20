package Lesson_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Написать программу, определяющую правильность расстановки скобок в выражении.

// Пример 1: a+(d*3) - истина

// Пример 2: [a+(1*3) - ложь

// Пример 3: [6+(3*3)] - истина

// Пример 4: {a}[+]{(d*3)} - истина

// Пример 5: <{a}+{(d*3)}> - истина

// Пример 6: {a+]}{(d*3)} - ложь

// <({[]})> --- истина

public class brackets {
    public static void main(String[] args) {
        String input = new String("<({a})+{(d*3)}>");
        System.out.println(comparesmentMap(input));
    }

    public static boolean comparesmentMap(String input) {
        char[] symbols = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');
        for (Character item : symbols) {
            if (map.containsValue(item)) {
                stack.push(item);
            }
            if (map.containsKey(item)) {
                if (stack.empty() || stack.pop() != map.get(item)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}