package shapes;

public class PentagonalPrism extends Shape3D
{
	private double height;
	private double side;
	
	public PentagonalPrism(double height, double side) {
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
		return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
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
