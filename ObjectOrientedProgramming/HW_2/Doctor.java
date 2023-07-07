package ObjectOrientedProgramming.HW_2;

import java.util.Date;

public class Doctor extends Human implements Heal{

    public Doctor(String name, Date brdate) {
        super(name, brdate);        
    }

    @Override
    public void setRunSpeed(Integer speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRunSpeed'");
    }

    @Override
    public void setSwimSpeed(Integer speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSwimSpeed'");
    }

    @Override
    public void setVoice(String say) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVoice'");
    }

    @Override
    public void setFlySpeed(Integer speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFlySpeed'");
    }

    @Override
    public void toHeal(Object target) {
        ((Human)target).setHP((Integer)((Human)target).getHP()/10);
    }
    
}
