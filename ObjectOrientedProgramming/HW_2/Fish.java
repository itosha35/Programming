package ObjectOrientedProgramming.HW_2;

public class Fish extends Animal implements Swimable {
    private Integer speed = 0;

    public Fish(String name, String color) {
        super(name, color, "FISH", null);
    }

    @Override
    public void toSwim() {
        this.setStatus("SWIM");
        this.speed = 100;
    }

    @Override
    public Integer getSwimSpeed() {
        if (this.getStatus().equalsIgnoreCase("swim")) {
            return speed;
        } else
            return -1;
    }

    @Override
    public void setSwimSpeed(Integer speed) {
        if (this.getStatus().equalsIgnoreCase("SWIM"))
            this.speed = speed;
        else
            System.out.println("I'm out of water right now!");
    }

}
