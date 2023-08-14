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
                ==COMPLEX_VALUES_CALCULATOR==
                SET: +, -, *, /.
                FORMAT AS: REAL_num IM_num OPERATION REAL_num IM_num
                 Set " l " for logger """);
        String key = in.next().toLowerCase();
        CalculatorComplex calculator;
        Complex result = null;
        while (!key.equals("l")) {
            if (status == Status.FIRST) {
                calculator = new CalculatorComplex(key);
                status = Status.NEXT;
            } else
                calculator = new CalculatorComplex(result, key);
            result = controller.sendComplex(calculator);
            logging.add(new Log(calculator, result));
            System.out.print(result + "\n");
            System.out.println("Ready for next operation:");
            key = in.next().toLowerCase();
        }
        in.nextLine();

        loggingRun(in, logging);
    }

    private static void loggingRun(Scanner scanner, List<Log> logging) {
        System.out.print("SHOW LOGS? Y/N: ");
        String input = scanner.next();
        if (input.toUpperCase().equals("Y")) {
            if (!logging.isEmpty()) {
                for (Log log : logging) {
                    System.out.println(log);
                }
            } else
                System.out.println("The log is empty, no operations been proceeded");
        }
    }
}