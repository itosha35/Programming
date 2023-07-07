package ObjectOrientedProgramming.Seminar_4;

import java.util.Arrays;
import java.util.Iterator;

public class GBArrayList<E> implements GBList<E> {

    private E[] values;

    @SuppressWarnings("unchecked")
    public GBArrayList() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amount = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amount);
        } catch (ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @SuppressWarnings("unchecked")
    @Override
    public GBList<E> join(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;

        } catch (ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
        return this;
    }

    @Override
    public String toString() {
        return "GBArrayList [values=" + Arrays.toString(values) + "]";
    }
    
   

}
