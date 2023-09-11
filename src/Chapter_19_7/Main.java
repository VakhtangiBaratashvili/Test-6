package Chapter_19_7;

import static Chapter_19_7.BinarySearch.binarySearch;

class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 5, 7, 9, 11, 13, 15};
        int searchKey = 7;

        int index = binarySearch(numbers, searchKey);

        if (index != -1) {
            System.out.println(searchKey + " found at index " + index);
        } else {
            System.out.println(searchKey + " not found in the array");
        }
    }
}
