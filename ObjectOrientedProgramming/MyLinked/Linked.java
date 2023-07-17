package ObjectOrientedProgramming.MyLinked;

public interface Linked<E> {
    void addLast(E e);

    void addFirst(E e);

    int size();

    E getElementByIndex(int index);

    Container<E> join(E e);
}
