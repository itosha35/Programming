package ObjectOrientedProgramming.MyLinked;

import java.util.Iterator;

public class Container<E> implements Linked<E>, Iterable<E>, DescIterator<E> {

    private Node<E> node_first;
    private Node<E> node_last;
    private int size = 0;

    @SuppressWarnings("hiding")
    private class Node<E> {
        private E current_el;
        private Node<E> next_el;
        private Node<E> prev_el;

        private Node(E current_el, Node<E> prev_el, Node<E> next_el) {
            this.current_el = current_el;
            this.next_el = next_el;
            this.prev_el = prev_el;
        }

        public E getCurrentElement() {
            return current_el;
        }

        public void setCurrentElement(E current_elem) {
            this.current_el = current_elem;
        }

        public Node<E> getNextElement() {
            return next_el;
        }

        public void setNextElement(Node<E> next_elem) {
            this.next_el = next_elem;
        }

        public Node<E> getPrevElement() {
            return prev_el;
        }

        public void setPrevElement(Node<E> prev_elem) {
            this.prev_el = prev_elem;
        }
    }

    public Container() {
        node_last = new Node<E>(null, node_first, null);
        node_first = new Node<E>(null, null, node_last);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = node_last;
        prev.setCurrentElement(e);
        node_last = new Node<E>(null, prev, null);
        prev.setNextElement(node_last);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = node_first;
        next.setCurrentElement(e);
        node_first = new Node<E>(null, null, next);
        next.setPrevElement(node_first);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int index) {
        Node<E> target = node_first.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < size; i++) {
            line = line + (getElementByIndex(i)).toString() + " ";
        }
        return line;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }

        };
    }

    @Override
    public Iterator<E> descIterator() {
        return new Iterator<E>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return (counter >= 0);
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }

    @Override
    public Container<E> join(E e) {
        addLast(e);
        return this;
    }

}
