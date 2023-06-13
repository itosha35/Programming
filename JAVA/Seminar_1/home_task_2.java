
/**
 * Вывести все простые числа от 1 до 1000
 */
import java.util.Scanner;

public class home_task_2 {
    public static void OutSimple(int Number) {
        if (Number == 1) System.out.printf(":%d", 1);
        if (Number >= 2) System.out.printf(":%d:%d", 1, 2);
        for (int i = 1; i <= Number; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {                
                    break;
                } else {
                    if (j == i - 1) {
                        System.out.printf(":%d", i);
                    }
                }
            }
        }
    }

    public static int InputInt(String Message) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print(Message + ": ");
        Integer Number = sc.nextInt();
        sc.close();
        return Number;
    }

    public static void main(String[] args) {
        Integer num = InputInt("Введите число");
        OutSimple(num);
    }

}