package utilities;

import shapes.*;

public class MergeSort {

    public static void mergeSort(Shape[] array, int left, int right, String comparator) 
    {
        if (left < right)
        {
            int mid = (left + right)/2;

            // recursive function
            mergeSort(array, left, mid, comparator);
            mergeSort(array, mid + 1, right, comparator);
            // merge the sorted half
            merge(array, left, mid, right, comparator);
        }
    }

    public static void merge(Shape[] array, int left, int mid, int right, String comparator) {

        // find the two sub array
        int n1 = mid - left +1;
        int n2 = right - mid;

        // create two temp array
        Shape[] L = new Shape[n1];
        Shape[] R = new Shape[n2];

        // copy date to temp array
        for (int i = 0; i < n1; i++)
        {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++)
        {
            R[j] = array[mid + 1 + j];
        }

        // merge these temp array
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2)
        {
            if (L[i].compareTo(R[j],comparator) > 0) // DESCENDING ORDER
            {
                array[k++] = L[i++];
            }
            else
            {
                array[k++] = R[j++];
            }
        }

        // copy the remaining elements(remaining) of L[] if any
        while (i < n1)
        {
            array[k++] = L[i++];
        }
        while (j < n2)
        {
            array[k++] = R[j++];
        }

    }

    public static void sort(Shape[] array, String comparator) {

        mergeSort(array, 0, array.length -1, comparator);
    }
}
