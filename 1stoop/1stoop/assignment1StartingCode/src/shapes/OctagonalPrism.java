package shapes;

public class OctagonalPrism extends Shape3D {
	private double height;
	private double side;
	
	public OctagonalPrism(double height, double side) {
		this.height = height;
		this.side = side;
	}
	
	@Override
	public double calculateBaseArea() {
		return 2 * (1 + Math.sqrt(2)) *  side * side * height;
		}
	@Override
	public double calculateVolume() {
		return getTheBaseArea() * height;
	}
	
	@Override
	public double getTheHeight() {
		return height;
	}
	
	@Override
	public double getTheBaseArea() {
		double baseArea = calculateBaseArea();
		return baseArea;
	}
	
	@Override
	public double getTheVolume() {
		double volume = calculateVolume();
		return volume;
	}
}

