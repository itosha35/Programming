package ObjectOrientedProgramming.HW_1;

public class Animal {
    private String name;
    private Integer age;
    private String vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;  
    private Boolean mayGo;
    private Boolean mayFly;
    private Boolean maySwim;

    public Integer getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(Integer legsCount) {
        this.legsCount = legsCount;
    }

    public Boolean getMayGo() {
        return mayGo;
    }

    public void setMayGo(Boolean mayGo) {
        this.mayGo = mayGo;
    }

    public Boolean getMayFly() {
        return mayFly;
    }

    public void setMayFly(Boolean mayFly) {
        this.mayFly = mayFly;
    }

    public Boolean getMaySwim() {
        return maySwim;
    }

    public void setMaySwim(Boolean maySwim) {
        this.maySwim = maySwim;
    }

    public Animal(String name, Integer age, String vaccination, String color,
            String species, Owner owner, Integer legsCount, Boolean mayGo, Boolean mayFly, Boolean maySwim) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
        this.mayGo = mayGo;
        this.mayFly = mayFly;
        this.maySwim = maySwim;
    }

    public Animal(String name, String color, String species, Integer legsCount, Boolean mayGo, Boolean mayFly, Boolean maySwim) {
        this(name, null, null, color, species, null, legsCount, mayGo, mayFly, maySwim);
    }

    public Animal() {
        // default empty Animal
        this(null, null, null, null, null, null, null, false, false, false);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " is from species " + this.species + " has " + this.color + " color";
        // return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }

    public void toGo(Boolean mayGo) {
        if (this.getMayGo()) {
            System.out.println(this.name + " has started to go...");
        } else
            System.out.println("This Animal " + this.species + " can not go.");
    }

    public void toFly(Boolean mayFly) {
        if (this.getMayFly()) {
            System.out.println(this.name + " has started to fly...");
        } else
            System.out.println("This Animal " + this.species + " can not fly.");
    }

    public void toSwim(Boolean maySwim) {
        if (this.getMaySwim()) {
            System.out.println(this.name + " has started to swim...");
        } else
            System.out.println("This Animal " + this.species + " can not swim.");
    }
}
