package shapes;

public class Pyramid extends Shape3D
{
	private double height;
	private double edgeLength;
	
	public Pyramid(double height, double edgeLength) {
		this.height = height;
		this.edgeLength = edgeLength;
	}
	
	@Override
	public double getTheHeight() {
		return height;
	}
	
	
	public double getTheEdgeLength() {
		return edgeLength;
	}
	
	@Override 
	public double calculateVolume() {
		return (edgeLength * edgeLength * height) / 3;
	}
	
	@Override
	public double calculateBaseArea() {
		return edgeLength * edgeLength;
	}
	
	@Override
	public double getTheVolume() {
		double volume = calculateVolume();
		return volume;
	}
	
	@Override
	public double getTheBaseArea() {
		double baseArea = calculateBaseArea();
		return baseArea;
	}
}











