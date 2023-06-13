import java.util.Scanner;

public class home_task_3 {

    public static String InputEquation(String Message) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print(Message + ": ");
        String Equation = sc.nextLine();
        sc.close();
        return Equation;
    }

    public static void getCalculate(String equation) {
        int[] digit = new int[2];
        String d1 = ""; // null doesnt work properly!!! Very strange.
        String d2 = "";
        int sign = -1;
        for (int index = 0; index < equation.length(); index++) {
            if (Character.isDigit(equation.charAt(index)) || (equation.charAt(index)=='-' && index==0) ) {
                d1 = d1 + equation.charAt(index);
            } else {
                sign = index;
                break;
            }
        }
        for (int index = equation.length() - 1; index > 0; index--) {
            if (Character.isDigit(equation.charAt(index)) || (equation.charAt(index)=='-' && !Character.isDigit(equation.charAt(index-1))) ) {
                d2 = equation.charAt(index) + d2;
            } else
                break;
        }
        digit[0] = Integer.parseInt(d1);
        digit[1] = Integer.parseInt(d2);
        //System.out.printf("Digits are = %d,%d",digit[0],digit[1]);
        switch (equation.charAt(sign)) {
            case ('+'): {
                System.out.printf("Сумма чисел равна: %d",digit[0] + digit[1]);
                break;
            }
            case ('-'): {
                System.out.printf("Разница чисел равна: %d",digit[0] - digit[1]);
                break;
            }
            case ('*'): {
                System.out.printf("Произведение чисел равно: %d",digit[0]*digit[1]);
                break;
            }
            case ('/'): {
                System.out.printf("Частное от деления чисел равно: %d",digit[0]/digit[1]);
                break;
            }
            default: {
                System.out.println("Что-то пошло не так!");
                break;
            }
        }        
    }

    public static void main(String[] args) {
        String equ = InputEquation("Введите выражение");     
        getCalculate(equ);
    }
}