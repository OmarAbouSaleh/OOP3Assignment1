package shapes;

public class TriangularPrism extends Shape3D
{
	private double height;
	private double side;
	
	
	public TriangularPrism(double height, double side) {
		this.height = height;
		this.side = side;
	}
	
	@Override
	public double getTheHeight() {
		return height;
	}
	
	@Override
	public double calculateVolume() {
		return calculateBaseArea() * height;
	}
	
	@Override
	public double calculateBaseArea() {
		return (Math.sqrt(3) / (4) * side * side);
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
