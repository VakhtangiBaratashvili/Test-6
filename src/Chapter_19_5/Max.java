package Chapter_19_5;

class Max {

    public static <E extends Comparable<E>> E max(E[] list) {
        if (list.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        E maxElement = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(maxElement) > 0) {
                maxElement = list[i];
            }
        }

        return maxElement;
    }
}
