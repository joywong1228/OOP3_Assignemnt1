 Geometric Shape Sorting Application

Created by: Group 4
For: CPRG Assignment 1 - Complexity and Sorting

This Java application sorts 3D geometric shapes using multiple sorting algorithms and comparison strategies. 
It is developed as part of SAIT CPRG's Assignment 1: Complexity and Sorting.

------------------------------------------------------------
PROGRAM PURPOSE
------------------------------------------------------------

This program reads a list of 3D shapes (Cylinder, Cone, Pyramid, and various Prisms) from a text file, 
constructs shape objects, and sorts them based on one of the following properties:

- Height
- Volume
- Base Area

The sorting order is always **descending**.

Users can choose one of six sorting algorithms:
- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Custom Sort Algorithm (e.g., Heap Sort)

------------------------------------------------------------
KEY FEATURES
------------------------------------------------------------

✔ Abstract Shape Class:
   - All shapes inherit from a common abstract class.
   - Implements Comparable (by height) and Comparator (by base area, volume).

✔ Strategy Pattern:
   - Sorting property (-t) passed as argument: 
     -t h : by height
     -t v : by volume
     -t a : by base area

✔ Sorting Algorithm Selector:
   - User selects algorithm via -s flag:
     -s b : Bubble Sort
     -s s : Selection Sort
     -s i : Insertion Sort
     -s m : Merge Sort
     -s q : Quick Sort
     -s z : Custom Algorithm

✔ Command-Line Interface:
   - Input: -f[file], -t[type], -s[sort] in any order
   - Example: `java -jar Sort.jar -fshapes1.txt -ta -sq`

✔ Benchmarking:
   - Measures sort time in milliseconds
   - Displays first, last, and every 1000th item in the sorted array

✔ Error Handling:
   - Detects missing or malformed arguments and outputs user-friendly messages
