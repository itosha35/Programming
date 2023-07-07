package ObjectOrientedProgramming.HW_2;

public class Bird extends Animal implements Flyable, Soundable {
    private Integer speed;
    private String say = "CHIK-CHIRIK";

    public Bird(String name, String color, Integer legsCount) {
        super(name, color, "BIRDS", legsCount);
    }

    @Override
    public void toFly() {
        System.out.println("I " + this.getName() + "as a" + this.getSpecies() + " started flying...");
        this.speed = 100;
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
    public Integer getFlySpeed() {
        return this.speed;        
    }

    @Override
    public void setVoice(String say) {
        this.say = say;
    }

    @Override
    public void setFlySpeed(Integer speed) {
        this.speed = speed;
    }

}
