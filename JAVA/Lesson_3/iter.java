package JAVA.Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iter {
    public static void main(String[] args) {
    //    Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
    // Пройти по списку, найти и удалить целые числа.
        List<Object> array = new ArrayList<>(Arrays.asList("Земля",12, "Земля", 1,"Земля", 3, 4, 4.2, "Земля", "Земля"));

        // for (int i = 0; i < array.size(); i++) {
        //     if (array.get(i) instanceof Integer){
        //         array.remove(i);
        //         i--;
        //     }
        // }
        

        // for (int i = array.size()-1; i >= 0; i--) {
        //     if (array.get(i) instanceof Integer){
        //         array.remove(i);
        // }
        // }

        Iterator iter = array.iterator();
        while (iter.hasNext()){
            if (iter.next() instanceof Integer){
                iter.remove();
            }
        }
        System.out.println(array);
    }
}