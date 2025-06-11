package appDomain;

import shapes.*;
import utilities.MergeSort;

public class AppDriver {

	public static void main(String[] args) {
		// for checking only
		Shape[] shapes = {
				new Cone(3, 5),
				new Cone(2, 10),
				new Cone(4, 2)
		};

		MergeSort.sort(shapes, "volume");

		System.out.println("Sorted by volume: ");
		for (Shape shape : shapes) {
			System.out.println(shape + "\tVolume: \t" + shape.calVolume());
		}

		MergeSort.sort(shapes, "height");

		System.out.println("Sorted by height: ");
		for (Shape shape : shapes) {
			System.out.println(shape + "\tHeight: \t" + shape.getHeight());
		}

		MergeSort.sort(shapes, "base area");

		System.out.println("Sorted by base area: ");
		for (Shape shape : shapes) {
			System.out.println(shape + "\tBase area: \t" + shape.calBaseArea());
		}

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
				return shape.getVolume();
			case "Height":
				return shape.getHeight();
			default:
				return shape.getBaseArea();
		}
	}
}
