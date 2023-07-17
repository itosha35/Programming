package ObjectOrientedProgramming.Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    private int componentscount;
    static int count = 0;
    private int num = 0;

    public void setNum(int num) {
        this.num = num;
    }

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.componentscount = 0;
        Pharmacy.count++;
        this.num = Pharmacy.count;
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component); // lesson's approach
        componentscount++;
        return this;
    }

    @Override
    public String toString() {
        return "\n Pharmacy " + this.num + " [components=" + components + ", index=" + componentscount + "] \n";
    }

    @Override
    public Iterator<Component> iterator() {
        /*
         * return new Iterator<Component>() {
         * public Component next() {
         * return components.get(index++);
         * }
         * 
         * public boolean hasNext() {
         * return index < this.components.size();
         * }
         * };
         */
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        if (pow1 != pow2)
            return Integer.compare(pow1, pow2);
        else {
            pow1 = getNamePower(this);
            pow2 = getNamePower(o);
            return Integer.compare(pow1, pow2);
        }
    }

    private int getPower(Pharmacy pharmacy) {
        int power = 0;
        for (Component elem : pharmacy.getComponents()) {
            power += elem.getPower();
        }
        return power;
    }

    private int getNamePower(Pharmacy pharmacy) {
        int power = 0;
        for (Component elem : pharmacy.getComponents()) {
            power += elem.getName().length();// more comlex name - more power it has (usually)
        }
        return power;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public boolean equals(Pharmacy o) {
        boolean checks = false;
        for (Component el1 : this.getComponents()) {
            for (Component el2 : o.getComponents()) {
                if ((el1.getName().equalsIgnoreCase(el2.getName())) && (el1.getPower() == el2.getPower())) {
                    checks = true;
                } else
                    checks = false;
            }
        }
        return checks;
    }

    @Override
    public int hashCode() {        
        return super.hashCode();
    }
    
}
