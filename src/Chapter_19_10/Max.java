package Chapter_19_10;

import java.util.ArrayList;

class Max {

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        E maxElement = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(maxElement) > 0) {
                maxElement = list.get(i);
            }
        }

        return maxElement;
    }
}

