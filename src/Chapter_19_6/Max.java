package Chapter_19_6;

class Max {

    public static <E extends Comparable<E>> E max(E[][] list) {
        if (list.length == 0 || list[0].length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        E maxElement = list[0][0];

        for (E[] row : list) {
            for (E element : row) {
                if (element.compareTo(maxElement) > 0) {
                    maxElement = element;
                }
            }
        }

        return maxElement;
    }
}

