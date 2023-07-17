package ObjectOrientedProgramming.MyLinked;

public class Main {
    public static void main(String[] args) {
        Container<String> nums = new Container<>();
        nums.addLast("aaa");
        nums.addLast("bbb");
        nums.addFirst("ooo");
        System.out.println(nums.size());
        System.out.println(nums.getElementByIndex(1));
        System.out.println(nums);
        for (String line : nums) {
            System.out.println(line);
        }
    }
}
