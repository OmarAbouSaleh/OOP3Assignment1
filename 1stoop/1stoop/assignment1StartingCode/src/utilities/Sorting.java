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
	
	public static int quickSort(Shape3D[] shapes, int low, int high) {
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
	


	public static void insertionSort(Shape3D[] shapes) {
		for (int i = 1; i < shapes.length; i++) {
			Shape3D temp = shapes[i];
			int j = i -1;
			while (j >= 0 && shapes[j].getTheVolume()>temp.getTheVolume()) {
				shapes[j+1] = shapes[j];
				j=j-1;
			}
			shapes[j+1]= temp;
		}
			
	}
	
	public static void selectionSort(Shape3D[] shapes) {
		for (int i= 0; i < shapes.length -1; i++) {
			int min_index = i;
			for (int j = i + 1; j < shapes.length; j++)
				if (shapes[j].getTheVolume() < shapes[min_index].getTheVolume())
					min_index = j;
			
			Shape3D temp = shapes[min_index];
			shapes[min_index] = shapes[i];
			shapes[i] = temp;
			
		}
	}
	
	public static void mergeSort(Shape3D[] shapes, int left, int right) {
		if (left < right) {
			int middle= (left + right) / 2;
			mergeSort(shapes, left, middle);
			mergeSort(shapes, middle + 1, right);
			merge(shapes, left, middle, right);
			
					
		}
	}
	
	private static void merge(Shape3D[] shapes, int left, int middle, int right) {
		int l1 = middle - left + 1;
		int l2 = right - middle;
		
		Shape3D[] SubArray1 = new Shape3D[l1];
		Shape3D[] SubArray2 = new Shape3D[l2];
		
		for (int i=0; i <l1; ++i)
			SubArray1[i] = shapes[left + i];
		for (int j = 0; j< l2; ++j)
			SubArray2[j] = shapes[middle + 1 + j];
		int i = 0, j =0;
		
		
		int k = left;
		
		while (i< l1 && j < l2) {
			if (SubArray1[i].getTheVolume() <= SubArray2[j].getTheVolume()) {
				shapes[k] = SubArray1[i];
				i++;
			}
			else {
				shapes[k] = SubArray2[j];
				j++;
			}
			k++;
		}
		while (i < l1) {
			shapes[k] = SubArray1[i];
			i++;
			k++;
		}
		
		while (j < l2) {
			shapes[k] = SubArray2[j];
			j++;
			k++;
		}
		
	}
	
	public static void shellSort(Shape3D[] shapes) {
		int n = shapes.length;
		
		for (int gap = n/2; gap > 0; gap /=2) {
			for (int i = gap; i < n; i +=1) {
				Shape3D temp = shapes[i];
				
				int j;
				for (j = i; j >= gap && shapes[j - gap].getTheVolume() > temp.getTheVolume(); j -= gap) {
					shapes[j] = shapes[j- gap];
				}
				shapes[j] = temp;
			}
		}
	}
	
}
