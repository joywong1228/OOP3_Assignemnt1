package utilities;

import shapes.*;
import java.util.Comparator;

public class BubbleSort {

    public static void sort(Shape[] array, Comparator<Shape> comparator) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                int cmp = (comparator == null)
                        ? array[j].compareTo(array[j + 1])
                        : comparator.compare(array[j], array[j + 1]);

                if (cmp < 0) { // DESCENDING ORDER
                    Shape temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break; // No swaps means the array is sorted
            }
        }
    }
}
