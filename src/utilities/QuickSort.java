package utilities;

import shapes.Shape;

public class QuickSort {
    public static void sort(Shape[] list, String comparator) {
        quickSort(comparator, list, 0, list.length - 1);
    }

    public static void quickSort(String comparator, Shape[] list, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(comparator, list, first, last);
            quickSort(comparator, list, first, pivotIndex - 1);
            quickSort(comparator, list, pivotIndex + 1, last);
        }
    }

    public static int partition(String comparator, Shape[] list, int first, int last) {
        
        Shape pivot = list[last];
        int i = first - 1;
        int j = first;
        
        while (j < last) {
            if (list[j].compareTo(pivot, comparator) <= 0) {
                Shape temp = list[j];
                i++;
                list[j] = list[i];
                list[i] = temp;
            }
            j++;
        }

        i++;
        list[last] = list[i];
        list[i] = pivot;
        return i;
    }
}
