package JAVA.Seminar_2;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class task_2 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logs = Logger.getLogger(task_2.class.getName());
        String Path = "log_2.txt";
        FileHandler fhandler = new FileHandler(Path, false);
        logs.addHandler(fhandler);
        SimpleFormatter format = new SimpleFormatter();
        fhandler.setFormatter(format);
        int[] mas = fillArray(10, 10);        
        //showArray(mas);
        String s = "";
        s = getString(mas);
            logs.info("Initial array: " + s);        
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
            s = getString(mas);
            logs.info(s);
            // System.out.println(s);
        }
        logs.info("Sorting is Completed...");
    }

    public static int[] fillArray(int size, int range) {
        int[] mas = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            mas[i] = rand.nextInt(range);// positive values from 0 to the range
        }
        return mas;
    }

    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }

    public static String getString(int[] array) {
        String result = "";
        for (int i : array) {
            result = result + " " + Integer.toString(i);
        }
        return result;
    }

}
