package ObjectOrientedProgramming.HW_2;

import java.util.Arrays;

public class Cat extends Animal implements Runable, Swimable, Soundable {

    private Integer speed = 0;
    private String say = "MYAOW";

    public Cat(String name, String color, Integer legsCount) {
        super(name, color, "CATS", legsCount);
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

    @Override
    public void toSwim() {
        this.setStatus("SWIM");
        this.speed = 10;
    }

    @Override
    public Integer getSwimSpeed() {
        if (this.getStatus().equalsIgnoreCase("swim")) {
            return speed;
        } else
            return -1;
    }

    @Override
    public void toGo() {
        super.setStatus("GO");
        this.speed = 100;
    }

    @Override
    public Integer getRunSpeed() {
        if (this.getStatus().equalsIgnoreCase("go")) {
            return speed;
        } else
            return -1;
    }

    @Override
    public void setSwimSpeed(Integer speed) {
        if (this.getStatus().equalsIgnoreCase("SWIM")) this.speed = speed;
        else System.out.println("I'm not swimming right now");
    }

    @Override
    public void setRunSpeed(Integer speed) {
        if (this.getStatus().equalsIgnoreCase("go")) this.speed = speed;
        else System.out.println("I'm not running right now");
    }

    @Override
    public void toSing() {
        System.out.println(this.getSpecies()+ " says " + say);
    }

    @Override
    public String getVoice() {
        return this.say;
    }

    @Override
    public void setVoice(String say) {
        this.say = say;
    }
}
