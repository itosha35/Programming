package ObjectOrientedProgramming.Seminar_1;

public class Animal0 extends Animal {
    private Integer eyesCount;

    public Animal0(String name, Integer age, String vaccination, String color, String species, Owner owner,
            Integer legsCount) {
        super(name, age, vaccination, color, species, owner, legsCount);
        this.eyesCount = 2;
    }

    public Animal0() {
        this(null, null, null, null, null, null, null);
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {
        return "I'm animal0 ";
    }

    public Integer getEyesCount() {
        return eyesCount;
    }
}
