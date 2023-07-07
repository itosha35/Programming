package ObjectOrientedProgramming.HW_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Bird("Jacky", "RED", 2));
        animals.add(new Cat("Lapuss", "GREY", 4));
        animals.add(new Dog("Charley", "BROWN", 4));
        animals.add(new Fish("Dori", "MAGENTA"));
        for (Animal el : animals) {
            System.out.print(el + " ");
            System.out.println(el.getStatus());
            if (el instanceof Cat) {
                ((Cat) el).toGo();
                // ((Cat) el).setRunSpeed(10);
                System.out.print(el + " ");
                System.out.println(el.getStatus());
                System.out.println(((Cat) el).getRunSpeed());
            }
        }
        Doctor doc = new Doctor("John", null);
        System.out.println(doc);
        System.out.println(doc.getHP());
        doc.getIjure(30);
        System.out.println(doc.getHP());
        doc.toHeal(doc);
        System.out.println(doc.getHP());
        Human human = new Human("Alex", null);
        human.getIjure(40);
        System.out.println(human);
        System.out.println(human.getHP());
        doc.toHeal(human);
        System.out.println(human.getHP());
    }
}
