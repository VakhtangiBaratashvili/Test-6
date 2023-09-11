package Chapter_19_5;

import static Chapter_19_5.Max.max;

class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 6, 2, 8, 3, 9, 5};
        String[] strings = {"apple", "orange", "banana"};

        Integer maxNumber = max(numbers);
        String maxString = max(strings);

        System.out.println("Max number: " + maxNumber);
        System.out.println("Max string: " + maxString);
    }
}
