package ObjectOrientedProgramming.HW_2;

import java.util.Date;

public class Nurse extends Human implements Heal {

    public Nurse(String name, Date brdate) {
        super(name, brdate);      
    }

    @Override
    public void toHeal(Object target) {
        ((Human)target).setHP((Integer)((Human)target).getHP()/20);
    }

    @Override
    public void imPower(Object helper) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imPower'");
    }
    
}
