package view;


import controllers.Controller;
import controllers.V1Controller;
import data.CalculatorComplex;
import data.Complex;
import data.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viewer implements View {
    private final Controller controller;
    private Status status = Status.FIRST;

    private final List<Log> logging = new ArrayList<>();

    public Viewer() {
        this.controller = new V1Controller();
    }

    public void start() {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        System.out.println("""
                ___________________COMPLEX_NUMBER_CALCULATOR____________________
                ИНСТУКЦИЯ:
                операции (+, -, *, /), значения вводите в формате:\s
                <Действительное Мнимое СимволОперации Действительное Мнимое>
                 " c " для получения журнала """);
        String key = in.next().toLowerCase();
        CalculatorComplex calculator;
        Complex result = null;
        while (!key.equals("c")) {
            if (status == Status.FIRST) {
                calculator = new CalculatorComplex(key);
                status = Status.NEXT;
            } else calculator = new CalculatorComplex(result, key);
            result = controller.sendComplex(calculator);
            logging.add(new Log(calculator, result));
            System.out.print(result);
            key = in.next().toLowerCase();
        }
        in.nextLine();
        loggingGame(in, logging);
    }

    private static void loggingGame(Scanner scanner, List<Log> logging) {
        System.out.print("Хотите посмотреть логи? Y/N: ");
        String input = scanner.next();
        if (input.toUpperCase().equals("Y")) {
            for (Log log : logging) {
                System.out.println(log);
            }
        }
    }
}