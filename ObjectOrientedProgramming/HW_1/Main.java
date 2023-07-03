package ObjectOrientedProgramming.HW_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Bird("Jacky", "RED", 2));
        animals.add(new Cat("Lapuss", "GREY", 4));
        animals.add(new Dog("Charley", "BROWN", 4));
        animals.add(new Fish("Dori", "MAGENTA"));
        for (Animal el : animals) {
            System.out.print(el);
            if (el.getMayGo()) {
                System.out.print(" can GO, ");
            } else {
                System.out.print(" can not GO, ");
            }
            if (el.getMayFly()) {
                System.out.print(" can FLY, ");
            } else {
                System.out.print(" can not FLY, ");
            }
            if (el.getMaySwim()) {
                System.out.print(" can SWIM, ");
            } else {
                System.out.print(" can not SWIM, ");
            }
            System.out.println();
        }
        for (Animal el : animals) {
            el.toGo(el.getMayGo());
            el.toFly(el.getMayFly());
            el.toSwim(el.getMaySwim());
        }
    }
}
