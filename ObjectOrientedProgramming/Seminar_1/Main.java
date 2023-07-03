package ObjectOrientedProgramming.Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Slon", 32, "true", "White",
                "Mammal", new Owner("Stas"), 4);
        Animal animal1 = new Animal("Black", "Bird", 2);
        System.out.println(animal.getAge());
        animal.setAge(3);
        System.out.println(animal.getAge());
        System.out.println(animal);
        Animal0 animal0 = new Animal0(null, null, null, null, null, null, null);
        animal0.getAge();
        System.out.println(animal0);
        Animal cat = new Animal0();

        System.out.println(cat);
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog(null, null, null));
        animals.add(new Cat(null, null, null));
        animals.add(cat);
        animals.add(animal);
        animals.add(animal1);
        System.out.println(animals);
        for (Animal item : animals) {
            if (item instanceof Animal0) {
                // ((Cat)item).FIndFood(3);
                // ((Cat)item).FIndFood();
                System.out.println(((Animal0) item).getEyesCount());
            }
        }
        Cat barsik = new Cat(null, null, null);
        barsik.Hunt(1, 2, 3, 4, 5);
    }
}