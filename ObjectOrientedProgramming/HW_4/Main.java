package ObjectOrientedProgramming.HW_4;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Number> gbList = new GBLinkedList<>();
        gbList.add(1);
        gbList.add(2);
        gbList.join(3).join(4).join(5);
        System.out.println(gbList);
        gbList.addFromIndex(32, 5);
        System.out.println(gbList);
        gbList.addFromIndex(99, 0);
        System.out.println(gbList);
        gbList.addFromIndex(10, 1);
        System.out.println(gbList);
        gbList.addFromIndex(111, 5);
        System.out.println(gbList);
        
    }
}
