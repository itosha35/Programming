package ObjectOrientedProgramming.HW_2;

public abstract class Animal {
    private String name;
    private Integer age;
    private String color;
    private String species;
    private Integer legsCount;    
    private String status = "STILL";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(Integer legsCount) {
        this.legsCount = legsCount;
    }

    public Animal(String name, Integer age, String color,
            String species, Integer legsCount) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
        this.legsCount = legsCount;

    }

    public Animal(String name, String color, String species, Integer legsCount) {
        this(name, null, color, species, legsCount);
    }

    public Animal() {
        this(null, null, null, null, null);
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
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}
