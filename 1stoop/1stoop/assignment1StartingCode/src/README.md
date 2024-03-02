# Project Title: COMPLEXITY and SORTING with 3-Dimensional Shapes. 

## Description
This project is designed to demonstrate the implementation and testing of various sorting algorithms on a collection of 3D shapes. It includes a series of classes representing different 3D shapes, a sorting utility class with multiple sorting algorithms, and a testing class to execute and showcase the sorting functionality.

## Structure
- `shapes`: This package contains the abstract class `Shape3D` and its subclasses representing various 3D shapes such as `Cylinder`, `Cone`, `Pyramid`, `SquarePrism`, `TriangularPrism`, `PentagonalPrism`, and `OctagonalPrism`. Each shape class implements methods to calculate volume, base area, etc. 
- `utilities`: This package includes the `Sorting` class, which contains implementations of several sorting algorithms, including bubble sort, quick sort, insertion sort, selection sort, merge sort, and shell sort.
- `ShapeTesting.java`: Located in the `shapes` package, this class is responsible for reading shape data from a file, creating shape objects, sorting them using the specified sorting algorithm, and displaying the sorted shapes.

## How to Run
1. Compile the Java files. Ensure you are in the root directory of the project and run:
	java -jar Sort.jar -ffile_name -tv -sb
		-f or -F Followed by file_name(the file name and path) with no spaces.
		-t or -T followed by v(volume), h(height) or a (base area) with no spaces.
		-s or -S followed by b(bubble), s(selection), i(insertion), m(merge), q(quicksort), or z(Shell) with no spaces.
		
	Example commands:
		java -jar Sort.jar -fshapes1.txt -Tv -Sb
		java -jar Sort.jar -ta -sQ -f"res\shapes1".txt
		java -jar Sort.jar -tH -F"C:\temp\shapes1.txt" –sB
		
		
##Contributions
-Omar Abou-Saleh, Jasmine Athea De Leon, Mark Louie Badillo, Mitchell Kelm, Edward Ouston
