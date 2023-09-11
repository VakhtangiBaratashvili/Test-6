package Chapter_19_1;

class GenericStack<E> {
    private E[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 15;

    public GenericStack() {
        elements = (E[])new Object[INITIAL_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        return elements[size - 1];
    }

    public void push(E o) {
        if (size >= elements.length) {
            E[] newElements = (E[])new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = o;
    }

    public E pop() {
        E o = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("stack: ");
        for (int i = size - 1; i >= 0; i--) {
            result.append(elements[i]).append(" ");
        }
        return result.toString();
    }
}

