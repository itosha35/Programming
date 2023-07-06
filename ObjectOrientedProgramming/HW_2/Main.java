package ObjectOrientedProgramming.HW_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        // animals.add(new Bird("Jacky", "RED", 2));
        animals.add(new Cat("Lapuss", "GREY", 4));
        // animals.add(new Dog("Charley", "BROWN", 4));
        // animals.add(new Fish("Dori", "MAGENTA"));
        for (Animal el : animals) {            
            System.out.println(el);
            ((Cat) el).toGo();
            ((Cat) el).setRunSpeed(10);
            System.out.println(((Cat) el).getRunSpeed());
            System.out.println(el.getStatus());
        }

    }
}
