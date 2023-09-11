package Chapter_19_3;

import java.util.ArrayList;

import static Chapter_19_3.RemoveDuplicates.removeDuplicates;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Original list: " + numbers);

        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);

        System.out.println("List with duplicates removed: " + uniqueNumbers);
    }
}
