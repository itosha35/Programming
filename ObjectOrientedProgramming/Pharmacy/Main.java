package ObjectOrientedProgramming.Pharmacy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy1 = new Pharmacy();
        Component comp1 = new Component("Penicillin", "10 mg", 10);
        Component comp2 = new Component("Spirit", "100 g", 1000);
        pharmacy1.addComponent(comp1).addComponent(comp2);

        Pharmacy pharmacy2 = new Pharmacy();
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 13);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy();
        Component comp5 = new Component("Penicillin", "10 mg", 12);
        Component comp6 = new Component("Spirit", "100 g", 100);
        pharmacy3.addComponent(comp5).addComponent(comp6);

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);
        Collections.sort(nomenclature);
        Pharmacy pharmacy4 = pharmacy2;
        nomenclature.add(pharmacy4);
        pharmacy4.setNum(4);
        Set<Pharmacy> result = new HashSet<>();
        for (Pharmacy pharm : nomenclature) {
            if (!result.isEmpty()) {
                if (!result.contains(pharm)) {
                    result.add(pharm);
                }
            } else
                result.add(pharm);                
        }
        System.out.println("HASH SET has " + result.size() + " components");
        System.out.println("====================");
        System.out.println(result);

    }
}
