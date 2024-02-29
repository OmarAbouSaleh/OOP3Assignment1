package shapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShapeTesting {

	public static void main(String[] args) {
		
		String filename = null;
		for (int i = 0; i < args.length; i++) {
			if ("-f".equals(args[i])) {
				filename = args[++i];
			}//commands line arguments
		}
		
		if (filename == null) {
			System.out.println("java Shape Test -f filename");
			System.exit(1);
		}// making sure the file name is provided
		
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			int numberOfShapes = scanner.nextInt();
			Shape3D[] shapes = new Shape3D[numberOfShapes];
			// reading the number of shapes from the first line
			
			for (int i = 0; i < numberOfShapes && scanner.hasNext(); i++) {
				String shapeType = scanner.next();
				double height = scanner.nextDouble();
				double lenghtOrRadius = scanner.nextDouble();
				//reading the file 
				
				switch (shapeType) {
				case "Cylinder":
					shapes[i] = new Cylinder(height, lenghtOrRadius);
					break;
				case "Cone":
					shapes[i] = new Cone(height, lenghtOrRadius);
					break;
				case "Pyramid":
					shapes[i] = new Pyramid(height, lenghtOrRadius);
					break;
				case "SquarePrism": 
					shapes[i] = new SquarePrism(height, lenghtOrRadius);
					break;
				case "TriangularPrism":
					shapes[i] = new TriangularPrism(height, lenghtOrRadius);
					break;
				case "PentagonalPrism": 
					shapes[i] = new PentagonalPrism(height, lenghtOrRadius);
					break;
				case "OctangonalPrism":
					shapes[i] = new OctagonalPrism(height, lenghtOrRadius);
					break;
				default:
					System.out.println("Invalid shape type");
					break;
				}				
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found: " + filename);
			e.printStackTrace();
		}
		
		

	}

}
