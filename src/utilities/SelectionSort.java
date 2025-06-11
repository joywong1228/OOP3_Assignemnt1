package utilities;

import shapes.Shape;

public class SelectionSort {

    public static void sort(Shape[] array, String comparator)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int max = i; // DESCENDING ORDER
            for(int j = i + 1; j < array.length; j++)
            {
                if (array[max].compareTo(array[j], comparator) < 0)
                {
                    max = j;
                }
            }

            Shape temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
    }
    
}
