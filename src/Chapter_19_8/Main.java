package Chapter_19_8;

import java.util.ArrayList;

import static Chapter_19_8.Shuffle.shuffle;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Original list: " + numbers);

        shuffle(numbers);

        System.out.println("Shuffled list: " + numbers);
    }
}
