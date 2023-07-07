package ObjectOrientedProgramming.HW_2;

import java.util.Date;

public class Human implements Runable, Swimable, Soundable, Flyable {
    private String name = "null";
    private Date brdate = new Date();
    private String say = "HELLO!";
    private String status = "STILL";
    private Integer speed = 0;
    private Integer hp = 100;

    public Human(String name, Date brdate) {
        this.name = name;
        this.brdate = brdate;
    }

    @Override
    public String toString() {
        return "I am " + name + "(" + brdate + ")";
    }

    @Override
    public void toSing() {
        System.out.println(this.name + " says " + say);
        this.setStatus("sing");
    }

    @Override
    public String getVoice() {
        if (this.getStatus().equalsIgnoreCase("swim")) {
            return this.say;
        } else
            return "I'm not saying anything...";
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
        this.setStatus("GO");
        this.speed = 35;
    }

    @Override
    public Integer getRunSpeed() {
        if (this.getStatus().equalsIgnoreCase("go")) {
            return speed;
        } else
            return -1;
    }

    @Override
    public void toFly() {
        System.out.println("I " + this.getName() + "as a Human started flying on plane...");
        this.speed = 800;
        this.setStatus("FLY");
    }

    @Override
    public Integer getFlySpeed() {
        if (this.getStatus().equalsIgnoreCase("fly")) {
            return speed;
        } else
            return -1;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getIjure(Integer damage) {
        this.hp = this.hp - damage;
        if (this.hp <= 10)
            System.out.println("Need Heal!!!");
        if (this.hp <= 0)
            dead();
    }

    private void dead() {
        System.out.println("I went to Heaven...");
        this.hp = 0;
        this.setStatus("NOT ALIVE");
    }

    public Integer getHP() {
        return this.hp;
    }

    public void setHP(Integer heal) {
        this.hp += heal;
    }

    @Override
    public void setFlySpeed(Integer speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFlySpeed'");
    }

    @Override
    public void setVoice(String say) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVoice'");
    }

    @Override
    public void setSwimSpeed(Integer speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSwimSpeed'");
    }

    @Override
    public void setRunSpeed(Integer speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRunSpeed'");
    }
}
