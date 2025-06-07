package appDomain;

import shapes.*;
import utilities.MergeSort;
import utilities.SelectionSort;

public class AppDriver
{

	public static void main( String[] args )
	{
		// for checking only
		Shape[] shapes = {
			new Cone(3,5),
			new Cone(2,10),
			new Cone(4,2)
		};

		SelectionSort.sort(shapes, "volume");

		System.out.println("Sorted by volume: ");
		for (Shape shape: shapes) {
			System.out.println(shape + "\tVolume: \t" + shape.calVolume());
		}

		SelectionSort.sort(shapes, "height");

		System.out.println("Sorted by height: ");
		for (Shape shape: shapes) {
			System.out.println(shape + "\tHeight: \t" + shape.getHeight());
		}

		SelectionSort.sort(shapes, "base area");

		System.out.println("Sorted by base area: ");
		for (Shape shape: shapes) {
			System.out.println(shape + "\tBase area: \t" + shape.calBaseArea());
		}

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

}
