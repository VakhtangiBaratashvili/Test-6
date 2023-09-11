package Chapter_19_4;

import static Chapter_19_4.LinearSearch.linearSearch;

class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 6, 2, 8, 3, 9, 5};
        int searchKey = 8;

        int index = linearSearch(numbers, searchKey);

        if (index != -1) {
            System.out.println(searchKey + " found at index " + index);
        } else {
            System.out.println(searchKey + " not found in the array");
        }
    }
}
