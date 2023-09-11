package Chapter_19_9;

import java.util.ArrayList;

import static Chapter_19_9.Sort.sort;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);

        System.out.println("Original list: " + numbers);

        sort(numbers);

        System.out.println("Sorted list: " + numbers);
    }
}
