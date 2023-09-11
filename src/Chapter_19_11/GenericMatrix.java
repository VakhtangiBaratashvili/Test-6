package Chapter_19_11;

abstract class GenericMatrix<E> {

    protected E[][] data;

    public GenericMatrix(int rows, int cols) {
        data = (E[][])new Object[rows][cols];
    }

    public E get(int i, int j) {
        return data[i][j];
    }

    public void set(int i, int j, E value) {
        data[i][j] = value;
    }

    public void printResult() {
        for (E[] row : data) {
            for (E element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    protected abstract E add(E o1, E o2);

    protected abstract E multiply(E o1, E o2);

    protected abstract E zero();
}

