package JAVA.Seminar_2;

/*
*Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
*Если значение null, то параметр не должен попадать в запрос.
*Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
*name
*country
*city
*age
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        // String input = "name:Ivanov," + "country:Russia," + "city:Moscow," +
        // "age:null";
        System.out.println("sql - Request select * from students WHERE ");
        String input = InputWHERE(
                "Please, input the WHERE as follows:\n name:value, country:value, city:value, age:value");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(input.split(",")));
        StringBuilder filter = new StringBuilder();
        filter.append("select * from students WHERE ");
        for (String s : list) {
            s = s.replace(":", " = ");
            if (s.contains("null"))
                continue;
            filter.append(s).append(" AND ");
        }
        filter.setLength(filter.length() - 5);
        System.out.println(filter);
    }

    public static String InputWHERE(String Message) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print(Message + ": ");
        String where = sc.nextLine();
        sc.close();
        return where;
    }
}
