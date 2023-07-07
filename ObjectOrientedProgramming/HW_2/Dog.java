package ObjectOrientedProgramming.HW_2;

public class Dog extends Animal implements Runable, Swimable, Soundable {

    private Integer speed = 0;
    private String say = "WOF";

    public Dog(String name, String color, Integer legsCount) {
        super(name, color, "DOGS", legsCount);
    }

    @Override
    public void toSwim() {
        this.setStatus("SWIM");
        this.speed = 12;
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
        this.speed = 90;
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
        if (this.getStatus().equalsIgnoreCase("SWIM"))
            this.speed = speed;
        else
            System.out.println("I'm not swimming right now");
    }

    @Override
    public void setRunSpeed(Integer speed) {
        if (this.getStatus().equalsIgnoreCase("go"))
            this.speed = speed;
        else
            System.out.println("I'm not running right now");
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
