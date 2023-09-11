package Chapter_19_10;

import java.util.ArrayList;

import static Chapter_19_10.Max.max;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);

        Integer maxNumber = max(numbers);

        System.out.println("Max number: " + maxNumber);
    }
}
