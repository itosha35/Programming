package Lesson_5;

import java.util.HashMap;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        System.out.println(stk);
        stk.push(2);
        System.out.println(stk);
        stk.push(3);
        System.out.println(stk);
        System.out.println(stk.pop());        
        System.out.println(stk);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        System.out.println(map.get(1));
        System.out.println(map.containsValue(1));
    }
}
