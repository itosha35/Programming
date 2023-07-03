package ObjectOrientedProgramming.HW_1;

public class Owner {
    private String name = "null";

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The owner is " + name;
    }
}
