package ObjectOrientedProgramming.HW_2;

import java.util.Date;

public abstract class Human implements Runable, Swimable, Soundable, Flyable {
    private String name = "null";
    private Date brdate = new Date();    

    public Human(String name, Date brdate) {
        this.name = name;
        this.brdate = brdate;
    }

    @Override
    public String toString() {
        return "The owner is " + name + "(" + brdate + ")";
    }

    @Override
    public void toSing(Boolean maySing) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toSing'");
    }

    @Override
    public Integer getVoice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVoice'");
    }

    @Override
    public void toSwim(Boolean maySwim) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toSwim'");
    }

    @Override
    public Integer getSwimSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSwimSpeed'");
    }

    @Override
    public void toGo(Boolean mayGo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toGo'");
    }

    @Override
    public Integer getRunSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRunSpeed'");
    }

    @Override
    public void toFly(Boolean mayFly) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toFly'");
    }

    @Override
    public Integer getFlySpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlySpeed'");
    }
}
