package appDomain;

import shapes.*;
import utilities.BubbleSort;
import utilities.InsertionSort;
import utilities.MergeSort;
import utilities.SelectionSort;
import utilities.QuickSort;
import utilities.CycleSort;

public class AppDriver {

	private static String compareTypeLabel = null;

	public static void main(String[] args) {

		// default variable for file name, compare type and sort method
		String filaName = null;
		char compareType = '\0';
		char sortMethod = '\0';

		// read the execution c
		for (String arg : args) {
			char flag = Character.toLowerCase((arg.charAt(1)));
			String value = arg.substring(2).replace("\"", "");

			switch (flag) {
				case 'f':
					if (!value.contains(".txt")) // if .txt is not read by the system, add it
					{
						value += ".txt";
					}
					filaName = value;
					break;
				case 't':
					if (value.length() == 1) {
						compareType = Character.toLowerCase(value.charAt(0));
					}
					break;
				case 's':
					if (value.length() == 1) {
						sortMethod = Character.toLowerCase(value.charAt(0));
					}
					break;
				default:
					System.out.println("Unknown flag: " + flag);
					break;
			}
		}
		if (filaName == null || compareType == '\0' || sortMethod == '\0') {
			System.out.println("Missing required arguments.");
			System.out.println("Usage: java -jar Sort.jar -f<filename> -t<type> -s<sort>");
			return;
		}

		// testing only, will remove later after file reader is applied.
		System.out.println("File: " + filaName);
		System.out.println("Compare Type: " + compareType);
		System.out.println("Sort Method: " + sortMethod);

		// translating compare type into the label
		switch (compareType) {
			case 'v':
				compareTypeLabel = "volume";
				break;
			case 'h':
				compareTypeLabel = "height";
				break;
			case 'a':
				compareTypeLabel = "base area";
				break;
			default:
				System.err.println("Compare Type is missing");
				break;
		}

		// implement read file in here
		Shape[] shapes = BasicFileIO.readFile(filaName);

		long startTime = System.currentTimeMillis();
		// translating sorting method
		switch (sortMethod) {
			case 'b':
				BubbleSort.sort(shapes, compareTypeLabel);
				break;
			case 's':
				SelectionSort.sort(shapes, compareTypeLabel);
				break;
			case 'i':
				InsertionSort.sort(shapes, compareTypeLabel);
				break;
			case 'm':
				MergeSort.sort(shapes, compareTypeLabel);
				break;
			case 'q':
				QuickSort.sort(shapes, compareTypeLabel);
				break;
			case 'z':
				CycleSort.sort(shapes, compareTypeLabel);
				break;
			default:
				System.err.println("No sorting method is found");
				break;
		}

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime; // in milliseconds
		System.out.println("Sorting completed in " + duration + " milliseconds.");
		displayOutput(shapes); // pass whatever your groupmate parsed

		// TODO Auto-generated method stub

		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

	}

	private static void displayOutput(Shape[] shapes) {
		int length = shapes.length;

		System.out.println("Total shapes: " + length);

		System.out.printf("First element is:    %-25s %s: %.15f\n",
				shapes[0].getClass().getName(),
				// compareTypeLabel will be set by the getComparator, like a = Area, v = Volume,
				// h = Height
				compareTypeLabel,
				getCompareValue(shapes[0]));

		// try to get every 1000th element
		for (int i = 1000; i < length; i += 1000) {
			System.out.printf("%d-th element:    %-25s %s: %.15f\n",
					i,
					shapes[i].getClass().getName(),
					compareTypeLabel,
					getCompareValue(shapes[i]));
		}

		// last element
		System.out.printf("Last element is:     %-25s %s: %.15f\n",
				shapes[length - 1].getClass().getName(),
				compareTypeLabel,
				getCompareValue(shapes[length - 1]));
	}

	private static double getCompareValue(Shape shape) {
		switch (compareTypeLabel) {
			case "Volume":
				return shape.calVolume();
			case "Height":
				return shape.getHeight();
			default:
				return shape.calBaseArea();
		}
	}
}