package utilities;

import shapes.Shape3D;

public class Sorting {

	public static void bubbleSort(Shape3D[] shapes) {
		Shape3D temp;
		for (int i = 0; i < shapes.length; i++) {
			for (int j = 1; j < (shapes.length - i); j++) {
				if (shapes[j - 1].getTheVolume() > shapes[j].getTheVolume()) {
					temp = shapes[j - 1];
					shapes[j - 1] = shapes[j];
					shapes[j] = temp;
				}
			}
		}
	}
	
	private static int quickSort(Shape3D[] shapes, int low, int high) {
		double pivot = shapes[high].getTheVolume();
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (shapes[j].getTheVolume() < pivot) {
				i++;
				Shape3D temp = shapes[i];
				shapes[i] = shapes[j];
				shapes[j] = temp;
			}
		}
		Shape3D temp = shapes[i + 1];
		shapes[i + 1] = shapes[high];
		shapes[high] = temp;
		return i + 1;
	}

}
