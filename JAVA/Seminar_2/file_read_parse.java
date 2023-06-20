package JAVA.Seminar_2;
/*
Дана строка в файле(читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит строчку и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class file_read_parse {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("input.txt");
        FileReader reader = new FileReader(f);
        ArrayList<String> list = new ArrayList<>(Arrays.asList());
        StringBuilder res = new StringBuilder();
        
    }
}
