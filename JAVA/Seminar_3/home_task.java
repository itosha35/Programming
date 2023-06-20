package Seminar_3;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import Lesson_5.stack;

public class home_task {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = fillList(InputInt("Set size of List(Integer)"), 100);
        System.out.println(List1);
        removeEvenDigits(List1);
        System.out.println("Even values are removed:");
        System.out.println(List1);
        System.out.println("Min = " + findMin(List1));
        System.out.println("Max = " + findMax(List1));
        System.out.printf("Average = %.2f", averageList(List1));// format representation
    }

    public static Object averageList(ArrayList<Integer> list) {
        double avr = 0;
        for (Integer i : list) {
            avr += i;
        }
        avr = avr / list.size();
        return avr;
    }

    public static int findMin(ArrayList<Integer> list) {
        Integer min = 100;
        for (Integer i : list) {
            if (i <= min) {
                min = i;
            }
        }
        return min;
        // return Collections.min(list);
    }

    public static int findMax(ArrayList<Integer> list) {
        Integer max = -1;
        for (Integer i : list) {
            if (i >= max) {
                max = i;
            }
        }
        return max;
        // return Collections.max(list);
    }

    public static void removeEvenDigits(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    public static ArrayList<Integer> fillList(int size, int range) {
        ArrayList<Integer> list = new ArrayList<>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(i, rand.nextInt(range));
        }
        return list;
    }

    public static int InputInt(String Message) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print(Message + ": ");
        Integer Number = Integer.parseInt(sc.nextLine());
        sc.close();
        return Number;
    }

}
