package utilities;

import shapes.Shape;

public class SelectionSort {

    public static void sort(Shape[] array, String comparator)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < array.length; j++)
            {
                if (array[min].compareTo(array[j], comparator) > 0)
                {
                    min = j;
                }
            }

            Shape temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    
}
