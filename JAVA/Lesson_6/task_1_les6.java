package Lesson_6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 99 элементов случайными цифрами от 0 до 50.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
// в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class task_1_les6 {
    public static void main(String[] args) {
        int range = 50;
        int size = 99;
        Integer[] array_Task = fillArray(size, range);
        System.out.println(Arrays.toString(array_Task));
        System.out.println(unic_counter(array_Task));
    }
    public static Integer[] fillArray(int size, int range) {
        Integer[] mas = new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            mas[i] = rand.nextInt(range);// positive values from 0 to the range
        }
        return mas;
    }
    public static float unic_counter(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        set.addAll(Arrays.asList(array));
        return (float)set.size() / array.length * 100;
    }
}
