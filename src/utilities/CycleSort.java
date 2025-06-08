package utilities;

import shapes.Shape;

public class CycleSort {
    public static void sort(Shape[] list, String comparator) {
        for (int i = 0; i < list.length-1; i++) {
            Shape item = list[i];
            int pos = i;

            // Count all smaller shape on right side of item
            for (int j = i+1; j < list.length; j++) 
                if (list[j].compareTo(item, comparator) < 0) 
                    pos++;

            // if item is not in correct position
            if (pos != i) {

                // If having any duplicate shape
                while (list[pos].compareTo(item, comparator) == 0) 
                    pos++;

                // Put item to right side
                if (list[pos].compareTo(item, comparator) != 0) {
                    Shape temp = item;
                    item = list[pos];
                    list[pos] = temp;
                }

                // Rotate the rest of the cycle until item is in correct position
                while (pos != i) {
                    pos = i;

                    for (int j = i+1; j < list.length; j++)
                        if (list[j].compareTo(item, comparator) < 0) 
                            pos++;

                    while (list[pos].compareTo(item, comparator) == 0) 
                        pos++;

                    if (list[pos].compareTo(item, comparator) != 0) {
                        Shape temp = item;
                        item = list[pos];
                        list[pos] = temp;
                    }
                }
            }
        }
    }
}
