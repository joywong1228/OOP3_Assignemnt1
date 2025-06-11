package utilities;

import shapes.Shape;

public class BubbleSort {
    public static void sort(Shape[] list, String comparator) {
        int n = list.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (list[j].compareTo(list[j + 1], comparator) < 0) {
                    // Swap
                    Shape temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in this pass, list is sorted
            if (!swapped) break;
        }
    }
}
