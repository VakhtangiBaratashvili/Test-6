package Chapter_19_2;

import java.util.ArrayList;

class GenericStack<E> extends ArrayList<E> {

    public GenericStack() {
        super();
    }

    public int getSize() {
        return super.size();
    }

    public E peek() {
        return super.get(getSize() - 1);
    }

    public void push(E o) {
        super.add(o);
    }

    public E pop() {
        E o = super.get(getSize() - 1);
        super.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}

