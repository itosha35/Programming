
import java.util.Scanner;

public class home_task_1 {
    public static void main(String[] args) {      
        Integer Number = InputInt("Введите число");
        System.out.printf("Факториал = %d \n", Fact(Number));
        System.out.printf("Сумма = %d", Summ(Number));        
    }

    public static int InputInt(String Message) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print(Message + ": ");
        Integer Number = sc.nextInt();
        sc.close();
        return Number;
    }

    public static int Fact(int Number) {
        int factor = 1;
        if (Number != 0) { // by default it is stated that 1 ... to Number but anyway
            for (int i = 1; i <= Number; i++) {
                factor = factor * i;
            }
            return factor;
        } else {
            return factor;
        }
    }

    public static int Summ(int Number) {
        int summa = 0;
        for (int i = 1; i <= Number; i++) {
            summa = summa + i;
        }
        return summa;
    }
}
