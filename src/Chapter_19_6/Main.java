package Chapter_19_6;

import static Chapter_19_6.Max.max;

class Main {
    public static void main(String[] args) {
        Integer[][] numbers = {
                {1, 4, 6},
                {2, 8, 3},
                {9, 5, 7}
        };

        String[][] strings = {
                {"apple", "orange", "banana"},
                {"cat", "dog", "fish"}
        };

        Integer maxNumber = max(numbers);
        String maxString = max(strings);

        System.out.println("Max number: " + maxNumber);
        System.out.println("Max string: " + maxString);
    }
}
