package ObjectOrientedProgramming.HW_2;

public class Bird extends Animal implements Flyable, Soundable {
    private Integer speed;
    private Integer voice;

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
        System.out.println("I " + this.getName() + "as a" + this.getSpecies() + " started singing...");
        this.voice = 100;
        
    }

    @Override
    public Integer getVoice() {
        return this.voice;
    }

    @Override
    public Integer getFlySpeed() {
        return this.speed;
        
    }

    @Override
    public void setVoice(Integer sound) {
        this.voice = sound;
    }

    @Override
    public void setFlySpeed(Integer speed) {
        this.speed = speed;
    }

}
