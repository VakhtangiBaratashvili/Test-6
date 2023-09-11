package Chapter_19_9;

import java.util.ArrayList;
import java.util.Collections;

class Sort {

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }
}

