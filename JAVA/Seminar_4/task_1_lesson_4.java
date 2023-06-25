package Seminar_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class task_1_lesson_4 {
    public static void main(String[] args) {
        int id1 = -15;
        int id2 = 12;
        Deque<Character> d1 = getDigitBack(id1);
        Deque<Character> d2 = getDigitBack(id2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.print("Multiplication of digits = ");
        System.out.println(getOperation('*', d1, d2));
        System.out.print("Summ of digits = ");
        System.out.println(getOperation('+', d1, d2));
    }

    public static Deque<Character> getDigitBack(int digit) {
        Deque<Character> dfill = new ArrayDeque<>();
        boolean neg = false;
        if (digit < 0) {
            neg = true;
            digit = -digit;
        }
        while (digit > 0) {
            dfill.addLast(Integer.toString(digit % 10).charAt(0));
            digit = digit / 10;
        }
        if (neg) {
            dfill.addLast('-');
        }
        return dfill;
    }

    public static Deque<Character> getOperation(Character operation, Deque<Character> d1, Deque<Character> d2) {
        Deque<Character> result = new ArrayDeque<>();
        String s1 = d1.toString();
        String s2 = d2.toString();
        s1 = s1.substring(1, s1.length() - 1).replaceAll(", ", "");
        s2 = s2.substring(1, s2.length() - 1).replaceAll(", ", "");
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        if (s1.charAt(s1.length() - 1) == '-') {
            s1 = s1.substring(0, s1.length() - 1);
            s1 = '-' + s1;
        }
        if (s2.charAt(s2.length() - 1) == '-') {
            s2 = s2.substring(0, s2.length() - 1);
            s2 = '-' + s2;
        }
        switch (operation) {
            case ('*'): {
                char[] res = Integer.toString((Integer.parseInt(s1) * Integer.parseInt(s2))).toCharArray();
                for (char e : res) {
                    result.addLast(e);
                }
                break;
            }
            case ('+'): {
                char[] res = Integer.toString((Integer.parseInt(s1) + Integer.parseInt(s2))).toCharArray();
                for (char e : res) {
                    result.addLast(e);
                }
                break;
            }
            default:
                break;
        }

        return result;
    }

}
