package appDomain;

import shapes.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicFileIO {
    public static String path = "res\\";
    public static Shape[] shapeArray;

    public static Shape[] readFile(String fileName) {
        Shape[] shapes = null;
        try {
            File file = new File(path+fileName);
            Scanner reader = new Scanner(file);

            String line;
            String[] fields;
            line = reader.nextLine();
            int numOfShapes = Integer.parseInt(line);
            shapes = new Shape[numOfShapes];

            for (int i = 0; i < numOfShapes; i++) {
                line = reader.nextLine();
                fields = line.split(" ");
                shapes[i] = null;

                switch (fields[0]) {
                    case "Cone":
                        shapes[i] = new Cone(Double.parseDouble(fields[1]), Double.parseDouble(fields[2]));
                        break;
                    case "Cylinder":
                        shapes[i] = new Cylinder(Double.parseDouble(fields[1]), Double.parseDouble(fields[2]));
                        break;
                    case "Pyramid":
                        shapes[i] = new Pyramid(Double.parseDouble(fields[1]), Double.parseDouble(fields[2]));
                        break;
                    case "SquarePrism":
                        shapes[i] = new SquarePrism(Double.parseDouble(fields[1]), Double.parseDouble(fields[2]));
                        break;
                    case "TriangularPrism":
                        shapes[i] = new TriangularPrism(Double.parseDouble(fields[1]), Double.parseDouble(fields[2]));
                        break;
                    case "PentagonalPrism":
                        shapes[i] = new PentagonalPrism(Double.parseDouble(fields[1]), Double.parseDouble(fields[2]));
                        break;
                    case "OctagonalPrism":
                        shapes[i] = new OctagonalPrism(Double.parseDouble(fields[1]), Double.parseDouble(fields[2]));
                        break;
                }
            }
            reader.close();
            return shapes;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return shapes;
        }
    }
}
