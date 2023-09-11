package Chapter_19_8;

import java.util.ArrayList;
import java.util.Random;

class Shuffle {

    public static <E> void shuffle(ArrayList<E> list) {
        Random rand = new Random();

        for (int i = list.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}

