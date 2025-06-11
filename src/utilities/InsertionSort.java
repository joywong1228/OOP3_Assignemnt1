package utilities;

import shapes.Shape;

public class InsertionSort {
    public static void sort(Shape[] list, String comparator) {
        for (int i = 1; i < list.length; i++) {
            Shape key = list[i];
            int j = i - 1;

            // Move elements that are smaller than key
            while (j >= 0 && list[j].compareTo(key, comparator) < 0) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }
}
