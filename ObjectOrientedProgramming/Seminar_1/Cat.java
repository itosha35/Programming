package ObjectOrientedProgramming.Seminar_1;

import java.util.Arrays;

public class Cat extends Animal {

    public Cat(String color, String species, Integer legsCount) {
        super(color, species, legsCount);        
    }

    private void FIndFood() {
        System.out.println("Cat found food ");
    }

    private void FIndFood(int... args) {
        System.out.println("Cat found food, count = " + Arrays.toString(args));
    }

    private void WakeUp() {
        System.out.println("Cat woke up ");
    }

    private void Sleep() {
        System.out.println("Cat sleeps ");
    }

    private void Eat() {
        System.out.println("Cat ate ");
    }

    public void Hunt(int... args) {
        WakeUp();
        FIndFood(args);
        Eat();
        Sleep();
    }
}
