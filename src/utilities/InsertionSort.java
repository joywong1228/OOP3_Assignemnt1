package utilities;

import shapes.Shape;
import java.util.Comparator;

public class InsertionSort {
    public static void sort(Shape[] array, Comparator<Shape> comparator) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            Shape key = array[i];
            int j = i - 1;

            while (j >= 0) {
                int cmp = (comparator == null)
                        ? key.compareTo(array[j]) // use height if no comparator is provided
                        : comparator.compare(key, array[j]);

                if (cmp > 0) {
                    // Move array[j] to one position ahead
                    array[j + 1] = array[j];
                    j--;

                } else {
                    // Found the correct position for key
                    break;
                }
            }

            // Place key at its correct position
            array[j + 1] = key;
        }
    }
}
