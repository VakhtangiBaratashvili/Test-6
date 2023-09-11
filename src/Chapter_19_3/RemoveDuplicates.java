package Chapter_19_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicates {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Create a HashSet to store unique elements
        HashSet<E> set = new HashSet<>(list);

        // Create a new ArrayList with unique elements
        ArrayList<E> result = new ArrayList<>(set);

        return result;
    }
}

